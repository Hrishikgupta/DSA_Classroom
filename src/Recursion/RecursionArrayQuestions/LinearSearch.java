package Recursion.RecursionArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        int target = 18;
        System.out.println(search_TargetElement(arr, target, 0));
        findAllIndex(arr, target, 0);
        System.out.println(ls);
        System.out.println(findAllIndex1(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));
    }
    static boolean search_TargetElement(int[] arr, int target, int i){
        if(i==arr.length-1 && arr[i]!=target){
            return false;
        }
        return arr[i]==target || search_TargetElement(arr,target,i+1);
    }

    static int index_of_TargetElement(int[] arr, int target, int i){
        if(i==arr.length-1 && arr[i]!=target){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return index_of_TargetElement(arr, target, i+1);
    }

    //Find all index if multiple target value is present
    static ArrayList<Integer> ls = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            ls.add(i);
        }
        findAllIndex(arr, target, i+1);
    }

    //Now taking ArrayList as a parameter in the recurrsion and return type will be arraylist only
    static ArrayList findAllIndex1(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return findAllIndex1(arr, target, i+1, list);
    }

    //Return list without passing the arguments
    static ArrayList findAllIndex2(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        //this will containn answers for that function call only
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
