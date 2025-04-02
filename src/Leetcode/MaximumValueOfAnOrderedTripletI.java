package Leetcode;
//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/?envType=daily-question&envId=2025-04-02
//leetcode-2873
public class MaximumValueOfAnOrderedTripletI {
    public static void main(String[] args) {
        int[] num = {1000000,1,1000000};
        System.out.println(maximumTripletValue(num));
    }
    //<--------------------Brute force---------------------->
    //T.C: O(n^3)
//    public static long maximumTripletValue(int[] nums) {
//        long res = 0;
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if((nums[i]-nums[j])*nums[k]>res){
//                        res = (nums[i]-nums[j])*nums[k];
//                    }
//                }
//            }
//        }
//        return res;
//    }

    //<---------------------Optimised Approach----------------------->
    //T.C:O(n)
//    public static long maximumTripletValue(int[] nums){
//        long res = 0;
//        int n = nums.length;
//        int[] maxRight = new int[n];
//        maxRight[n-1]=nums[n-1];
//        for(int i=n-2;i>=0;i--){
//            maxRight[i]=Math.max(nums[i],maxRight[i+1]);
//        }
//        int maxLeft = nums[0];
//
//        for(int j=1;j<n-1;j++){
//            res = Math.max((long)(maxLeft-nums[j])*maxRight[j+1],res);
//            maxLeft = Math.max(maxLeft,nums[j]);
//        }
//        return res;
//    }

    //<-------------------------Another Optimised Approach------------------------->
    //T.C: O(n)
    public static  long maximumTripletValue(int[] nums){
        long res = 0;
        int dmax = 0;
        int imax = 0;
        for(int num: nums){
            res = Math.max(res, (long)dmax*imax);
            dmax = Math.max(dmax, imax-num);
            imax = Math.max(imax, num);
        }
        return res;
    }
}
