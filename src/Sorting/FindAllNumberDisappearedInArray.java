package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumberDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Sorting(arr));
    }
    static ArrayList<Integer> Sorting(int[] nums){
        int i=0;
        ArrayList<Integer> ls = new ArrayList<>();
        while(i< nums.length){
            if(nums[i]!= nums[nums[i]-1]){
                int correctidx = nums[i]-1;
                int temp = nums[i];
                nums[i]= nums[correctidx];
                nums[correctidx]=temp;
            }else{
                i++;
            }
        }
        for(int index = 0; index< nums.length; index++){
            if(nums[index]!=index+1){
                ls.add(index+1);
            }
        }

        return ls;
    }
}
