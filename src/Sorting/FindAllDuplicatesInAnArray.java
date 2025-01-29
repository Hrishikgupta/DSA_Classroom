package Sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1]){
                int correctidx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[correctidx];
                nums[correctidx] = temp;
            }else{
                i++;
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int value = 0;value< nums.length;value++){
            if(nums[value]!=value+1){
                ls.add(nums[value]);
            }
        }
        return ls;
    }

}
