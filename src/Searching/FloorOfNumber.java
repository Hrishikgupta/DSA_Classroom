package Searching;
//Solved using BinarySearch
//Q: Floor of Number
//floor = greatest number smallest or equal to target element
//        arr = {2,3,5,9,14,16,18} target = 15
//        floor(arr,target=15)=14
//        floor(arr,target=
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        System.out.println(Floor(arr,target));
    }
    static int Floor(int[] arr,int target){
        if(target>arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[end];
    }
}
