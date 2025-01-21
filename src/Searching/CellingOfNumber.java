package Searching;
//Solved using Binary Search
//Q: arr={2,3,5,9,14,16,18} target = 15
//celling means smallest element in arr greater or equal to target element
//celling(arr,target=14) = 14
//celling(arr,target=15) = 16
// target = 4 then = 5
// target = 9 then =

public class CellingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,14,14,16,18};
        int target = 10;
        System.out.println(Celling(arr,target));
    }
    static int Celling(int[] arr,int target){
        if(target>arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(target>arr[mid]){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return arr[end+1];
    }
}
