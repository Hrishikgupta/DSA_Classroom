package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,5,3,1};
        //System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr, 0,  arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity: O(NlogN)
    //Space Complexity: O(N)
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //In case some part left
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid = s+(e-s)/2;
        mergeSortInPlace(arr,0, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //In case some part left
        while(i<m){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<e){
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
