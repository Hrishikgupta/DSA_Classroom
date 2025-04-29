package Leetcode;
//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/?envType=daily-question&envId=2025-04-29
//leetcode-2962
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSubArraysWhereMaxElementAppearsAtleatKTimes {
    public static void main(String[] args) {
        int[] nums = {61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        int k = 2;
        System.out.println(countSubarrays(nums,k));
    }
    public static long countSubarrays(int[] nums, int k) {
        int maxE = Arrays.stream(nums).max().getAsInt();

        int n = nums.length;

        long result = 0;


        List<Integer> maxIndices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == maxE) {
                maxIndices.add(i);
            }

            int size = maxIndices.size();
            if (size >= k) {
                int last_i = maxIndices.get(size - k);
                result += last_i + 1;
            }
        }

        return result;
    }
}
