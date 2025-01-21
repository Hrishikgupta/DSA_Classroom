package Searching;
public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(LinearSearch(arr,target,start,end));
    }
    static int LinearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
