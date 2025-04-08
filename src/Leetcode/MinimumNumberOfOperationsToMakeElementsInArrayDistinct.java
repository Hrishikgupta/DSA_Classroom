package Leetcode;
//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08
//leetcode-3396
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,3,5,7};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums){
        int n = nums.length;
        Set<Integer> st = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            if (st.contains(nums[i])) {
                return (int)Math.ceil((i + 1) / 3.0);
            }
            st.add(nums[i]);
        }

        return 0;
    }
}
