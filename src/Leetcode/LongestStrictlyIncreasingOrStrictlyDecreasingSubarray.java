package Leetcode;
//leetcode - 3105
//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/?envType=daily-question&envId=2025-02-03
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(longestMonotonicSubarray(nums));
    }
    //TimeComplexity: O(n^2)
//    public static  int longestMonotonicSubarray(int[] nums) {
//        int increasing = 1;
//        int decreasing = 0;
//        //Increasing
//        for(int i=0;i<nums.length;i++){
//            int count = 1;
//            int j = i;
//            while(j<nums.length-1 && nums[j]<nums[j+1]){
//                count++;
//                j++;
//            }
//            if(count>increasing){
//                increasing = count;
//            }
//
//        }
//        //Decreasing
//        for(int i=0;i<nums.length;i++){
//            int count = 1;
//            int j = i;
//            while(j<nums.length-1 && nums[j]>nums[j+1]){
//                count++;
//                j++;
//            }
//            if(count>decreasing){
//                decreasing = count;
//            }
//
//        }
//        return Math.max(increasing,decreasing);
//    }

    //TimeComplexity: O(n)
    public static  int longestMonotonicSubarray(int[] nums) {
        int increasing = 1;
        int decreasing = 1;
        int result = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                increasing++;
                decreasing = 1;
                result = Math.max(result,increasing);
            } else if (nums[i]<nums[i-1]) {
                decreasing++;
                increasing = 1;
                result = Math.max(result,decreasing);
            }else{
                increasing = 1;
                decreasing = 1;
            }
        }
        return  result;
    }
}
