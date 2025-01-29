package Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums ={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int correctidx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[correctidx];
                nums[correctidx] = temp;
            }else{
                i++;
            }
        }
        for(int value = 0;value<nums.length;value++){
            if(nums[value] != value+1){
                return new int[]{nums[value],value+1};
            }
        }
        return new int[]{-1,-1};
    }
}
