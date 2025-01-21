package Searching;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,45,56,85,74,96,48,};
        int target = sc.nextInt();
        System.out.print(LinearSearching(arr,target));
    }
    static int LinearSearching(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int i =0;
        for(int num: arr){
            if(num == target){
                return i;
            }
            i++;
        }
        return -1;
    }
}
