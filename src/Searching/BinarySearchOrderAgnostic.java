package Searching;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 2;
        int[] arr1 = {99,95,93,87,85,83,70,77,60};
        int target1 = 70;
        System.out.println(BinarySearching(arr,target));
        System.out.println(BinarySearching(arr1,target1));
    }
    static int BinarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if (arr[start] < arr[end]) {
            while(start<=end){
                mid=(start+(end-start)/2);
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
        }else{
            while(start<=end){
                mid=(start+(end-start)/2);
                if(arr[mid]==target){
                    return mid;
                }
                if(arr[mid]<target){
                    end=mid-1;
                }
                if(arr[mid]>target){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
