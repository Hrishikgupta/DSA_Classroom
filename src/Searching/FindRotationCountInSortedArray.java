package Searching;

public class FindRotationCountInSortedArray {
    public static void main(String[] args) {
        int[] arr = {13,14,15,18,2,3,6,12};
        //output = 2
        System.out.println(piviot(arr));
    }
    static int piviot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
