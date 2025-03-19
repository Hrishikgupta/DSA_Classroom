package Leetcode;
//https://leetcode.com/problems/longest-nice-subarray/description/?envType=daily-question&envId=2025-03-18
//leetcode-2401
public class LongestNiceSubarray {
    public static void main(String[] args) {
        int[] nums = {3,1,5,11,13};
        System.out.println(longestNiceSubarray(nums));
    }

    public static int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int result = 0;

        for(int i = 0; i < n; i++) {
            int mask = 0;

            for(int j = i; j < n; j++) {
                if((mask & nums[j]) != 0) {
                    break;
                }

                result = Math.max(result, j - i + 1);
                mask = (mask | nums[j]);
            }
        }

        return result;
    }
}
