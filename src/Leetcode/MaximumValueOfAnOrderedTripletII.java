package Leetcode;
//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/?envType=daily-question&envId=2025-04-03
//leetcode-2874
public class MaximumValueOfAnOrderedTripletII {
    public static void main(String[] args) {
        int[] num = {1000000,1,1000000};
        System.out.println(maximumTripletValue(num));
    }
    public static long maximumTripletValue(int[] nums) {
        long res = 0;
        int n = nums.length;
        int[] rightMax = new int[n];
        rightMax[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(nums[i],rightMax[i+1]);
        }
        int leftMax = nums[0];
        for(int j=1;j<n-1;j++){
            res = Math.max((long)(leftMax-nums[j])*rightMax[j+1],res);
            leftMax = Math.max (leftMax,nums[j]);
        }
        return res;
    }
}
