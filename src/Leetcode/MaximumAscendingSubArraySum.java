package Leetcode;
//leetcode - 1800
//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
public class MaximumAscendingSubArraySum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int result = 0;
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                result = Math.max(result,sum);
                sum = nums[i];
            }
        }
        return Math.max(result,sum);
    }
}
