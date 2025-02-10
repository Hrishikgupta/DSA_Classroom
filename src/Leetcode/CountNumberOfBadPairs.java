package Leetcode;
//leetcode - 2364
//https://leetcode.com/problems/count-number-of-bad-pairs/description/?envType=daily-question&envId=2025-02-09
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(countBadPairs(nums));
    }
    //<---------------Brute Force Approach------------------------------->
    //Time Complexity : O(N^2)
//    public static long countBadPairs(int[] nums) {
//        long count = 0;
//        for(long i =0;i<nums.length;i++){
//            for(long j=i+1;j<nums.length;j++){
//                if(i<j && ((j-i)!=nums[(int)j]-nums[(int)i])){
//                    count++;
//                }
//            }
//
//        }
//        return count;
//    }
//<--------------------Optimal Approach---------------------------------->
    //Time Complexity : O(N)
    //Space Complexity : O(N)
    public static long countBadPairs(int[] nums) {
        long result = 0;
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]-i;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);

        for (int j = 1; j < nums.length; j++) {
            int countOfNumsj = map.getOrDefault(nums[j], 0);
            int totalNumsBeforej = j;
            int badPairs = totalNumsBeforej - countOfNumsj;
            result += badPairs;

            map.put(nums[j], countOfNumsj + 1);
        }

        return result;
    }
}
