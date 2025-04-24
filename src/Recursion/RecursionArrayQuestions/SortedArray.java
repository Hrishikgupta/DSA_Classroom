package Recursion.RecursionArrayQuestions;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(check_if_Array_is_Sorted_or_Not(arr,0));
        System.out.println(check_if_Array_is_Sorted_or_Not1(arr,0));
    }
    static boolean check_if_Array_is_Sorted_or_Not(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check_if_Array_is_Sorted_or_Not(arr,i+1);
    }

    //<---------------------------Another way--------------------------->
    static boolean check_if_Array_is_Sorted_or_Not1(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && check_if_Array_is_Sorted_or_Not(arr,i+1);
    }
}
