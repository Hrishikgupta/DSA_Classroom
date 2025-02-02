package Leetcode;
//leetcode - 1752
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/?envType=daily-question&envId=2025-02-02
import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {1,2,4,3};
        System.out.println(check(nums));
    }

    //Time Complexity : O(n^2)
//    public static boolean check(int[] nums) {
//        int n = nums.length;
//
//        int[] sorted = nums.clone();
//        Arrays.sort(sorted);
//
//        for (int r = 0; r < n; r++) {
//            boolean isSorted = true;
//            for (int i = 0; i < n; i++) {
//                if (sorted[i] != nums[(i + r) % n]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//
//            if (isSorted) {
//                return true;
//            }
//        }
//        return false;
//    }

    //<---------------------------------Optimal Approach--------------------------------------------->
    //Time Complexity: O(n)
    public static boolean check(int[] nums) {
        int peak = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                peak++;
            }
        }
        return (peak<=1);
    }
}
