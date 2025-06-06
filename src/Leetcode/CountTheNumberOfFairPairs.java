package Leetcode;
//https://leetcode.com/problems/count-the-number-of-fair-pairs/description/?envType=daily-question&envId=2025-04-19
//leetcode-2563
import java.util.Arrays;

public class CountTheNumberOfFairPairs {
    public static void main(String[] args) {
        int[] nums = {1,7,9,2,5};
        int lower = 11;
        int upper = 11;
        System.out.println(countFairPairs(nums,lower,upper));
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;

        Arrays.sort(nums); // Sort the array, O(n log n)

        long result = 0;

        for (int i = 0; i < n; i++) { // Iterate through each element, O(n * log n)
            int leftIdx = lowerBound(nums, i + 1, n, lower - nums[i]); // Find the first element not less than (lower - nums[i])
            int rightIdx = upperBound(nums, i + 1, n, upper - nums[i]); // Find the first element greater than (upper - nums[i])

            int x = leftIdx - 1 - i;
            int y = rightIdx - 1 - i;

            result += (y - x);
        }

        return result;
    }

    // Java equivalent of lower_bound in C++
    private static int lowerBound(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // Java equivalent of upper_bound in C++
    private static int upperBound(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
