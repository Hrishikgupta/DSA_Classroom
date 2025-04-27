package Leetcode;
//https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/?envType=daily-question&envId=2025-04-27
//leetcode-3392
public class CountSubarraysOfLengthThreeWithACondition {
    public static void main(String[] args) {
        //            0,1,2,3,4,5
        int[] nums = {-1,-4,-1,4};
        System.out.println(countSubarrays(nums));
    }
    public static int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            if(2*(nums[i]+nums[i+2])==nums[i+1]){
                count++;
            }
        }
        return count;
    }
}
