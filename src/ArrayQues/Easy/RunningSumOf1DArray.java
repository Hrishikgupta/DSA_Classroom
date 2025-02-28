package ArrayQues.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;
//leetcode-1480
//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
