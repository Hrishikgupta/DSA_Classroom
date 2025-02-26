package Leetcode;
//leetcode - 1749
//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/?envType=daily-question&envId=2025-02-26

public class MaximumAbsoluteSumOfAnySubArray {
    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};
        System.out.println(maxAbsoluteSum(nums));
    }
    //<---------------Self Approach----------------------->
    //54/66 testcases passed
//    public static int maxAbsoluteSum(int[] nums) {
//        int sum = 0;
//        for(int i=0;i<nums.length;i++){
//            int tempSum = 0;
//            for(int j=i;j<nums.length;j++){
//                tempSum+=nums[j];
//                if(sum<Math.abs(tempSum)){
//                    sum = Math.abs(tempSum);
//                }
//            }
//        }
//        return sum;
//    }
    //<---------------------Kadane's Algorithm for maxsubarrysum and minsybarraysum inside one for loop------------>
    //TimeComplexity: O(n)
    //SpaceComplexity: O(1)

    public static int maxAbsoluteSum(int[] nums) {
        int n = nums.length;

        int maxSum = nums[0];
        int minSum = nums[0];

        int currSumMax = nums[0];
        int currSumMin = nums[0];

        for (int i = 1; i < n; i++) {
            //Kadane's Algo for finding max subarray sum
            currSumMax = Math.max(nums[i], currSumMax + nums[i]);
            maxSum = Math.max(maxSum, currSumMax);

            //Kadane's Algo for finding min subarray sum
            currSumMin = Math.min(nums[i], currSumMin + nums[i]);
            minSum = Math.min(minSum, currSumMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
