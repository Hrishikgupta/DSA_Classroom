package Sorting;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,5,8,4,2,-4,-6,0};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<nums.length &&  nums[i]!=nums[nums[i]-1]){
                int correctidx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[correctidx];
                nums[correctidx] = temp;
            }else{
                i++;
            }
        }
        for(int value =0; value<nums.length;value++){
            if(nums[value]!=value+1){
                return value+1;
            }
        }
        return nums.length+1;
    }
}
