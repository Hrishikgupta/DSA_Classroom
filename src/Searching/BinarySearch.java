package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target =2;
        System.out.println(BinarySearching(arr,target));
    }
    static int BinarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //int mid = 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }
}
