package Searching;
public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,340,450,990};
        int target = 990;
        System.out.println(infiniteSortedArray(arr,target));
    }
    static int infiniteSortedArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newstart = end + 1;
            end = end + ( end - start + 1)*2;
            if(end>arr.length-1){
                end = arr.length-1;
            }
            start = newstart;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
