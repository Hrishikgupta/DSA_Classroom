package Leetcode;
//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/?envType=daily-question&envId=2025-04-09
//leetcode-3375
import java.util.HashSet;

public class MinimumOperationsToMakeArrayValuesEqualToK {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int k = 2;
        System.out.println(minOperations(nums,k));
    }
    public static int minOperations(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        int count = 0;
        for(int num : s){
            if(num<k){
                return -1;
            }
            if(num>k){
                count++;
            }
        }
        return count;
    }
}
