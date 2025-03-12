package Leetcode;
//leetcode-2529
//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2025-03-12
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        int nums[] = {5,20,66,1314};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
         int neg_count = 0;
         int pos_count = 0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]<0){
                 neg_count++;
             }else{
                 if(nums[i]!=0){
                     pos_count++;
                 }
             }
         }
         return Math.max(pos_count,neg_count);
    }
}
