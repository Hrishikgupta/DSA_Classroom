package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(Sorting(arr)));
    }
    static int[] Sorting(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                int correctidx = arr[i]-1;
                int temp = arr[i];
                arr[i]=arr[correctidx];
                arr[correctidx]=temp;
            }else{
                i++;
            }
        }
        return arr;
    }
}
