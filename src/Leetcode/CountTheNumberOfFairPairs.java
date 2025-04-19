package Leetcode;

public class CountTheNumberOfFairPairs {
    public static void main(String[] args) {
        int[] nums = {1,7,9,2,5};
        int lower = 11;
        int upper = 11;
        System.out.println(countFairPairs(nums,lower,upper));
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        int i=0,j=i+1;
        while(i<nums.length-1){
            if(nums[i]+nums[j]>=lower && nums[i]+nums[j]<=upper){
                count++;
            }
            if(j==nums.length-1){
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
        return count;
    }
}
