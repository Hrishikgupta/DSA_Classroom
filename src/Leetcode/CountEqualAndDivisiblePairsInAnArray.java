package Leetcode;
//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/?envType=daily-question&envId=2025-04-17
//leetcode-2176
public class CountEqualAndDivisiblePairsInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 1;
        System.out.println(countPairs(nums, k));
    }
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i*j%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
