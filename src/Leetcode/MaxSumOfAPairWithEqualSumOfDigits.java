package Leetcode;
//leetcode - 2342
//https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/?envType=daily-question&envId=2025-02-12
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] nums = {229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401};
        System.out.println((maximumSum(nums)) );
    }
    //<------------------------------ My Approach(didn't pass all testcases ------------------------------------>
//    public static int maximumSum(int[] nums) {
//        HashMap<Integer, int[]> mp = new HashMap<>();
//        int ans = -1;
//        for(int i=0;i<nums.length;i++){
//            int total = sum(nums[i]);
//            if(mp.containsKey(total)){
//                int[] ls = mp.get(total);
//                ls[0]=ls[0]+1;
//                ls[1]=ls[1]+nums[i];
//                mp.put(total,ls);
//            }else{
//                mp.put(total,new int[]{1,nums[i]});
//            }
//        }
//        for (Integer i : mp.keySet()) {
//            System.out.println("key: " + i + " value: " + Arrays.toString(mp.get(i)));
//            int[] ls = mp.get(i);
//            if(ls[0]==2 && ans<ls[1]){
//                ans = ls[1];
//            }
//        }
//        return ans;
//    }
//    static int sum(int num){
//        int sum = 0;
//        while(num>0){
//            int rem = num%10;
//            sum+=rem;
//            num=num/10;
//        }
//        return sum;
//    }

// <---------------------Brute Force Approach------------------------------------------>
    //Time Complexity: O(N^2*m), m = number of digits
    //Space Complexity : O(1)
//    public static int maximumSum(int[] nums){
//        int res= -1;
//        for(int i=0;i<nums.length;i++){
//            int digitSumi = sum(nums[i]);
//            for(int j=i+1;j<nums.length;j++){
//                int digitSumj = sum(nums[j]);
//                if(digitSumj==digitSumi){
//                    res = Math.max(res,nums[i]+nums[j]);
//                }
//            }
//        }
//        return res;
//    }
//    static int sum(int num){
//        int sum = 0;
//        while(num>0){
//            int rem = num%10;
//            sum+=rem;
//            num=num/10;
//        }
//        return sum;
//    }

    //<----------------------------Optimal Approach(Using Map)---------------------------------------------->
    //TimeComplexity: O(n*m),m = number of digit
    //SpaceComplexity: O(n)
//    public static int maximumSum(int[] nums) {
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        int ans = -1;
//        for(int i=0;i<nums.length;i++){
//            int total = sum(nums[i]);
//            if(mp.containsKey(total)){
//                ans = Math.max(ans,nums[i]+mp.get(total));
//            }
//            mp.put(total, Math.max(nums[i],mp.getOrDefault(total,0)));
//        }
//
//        return ans;
//    }
//    static int sum(int num){
//        int sum = 0;
//        while(num>0){
//            int rem = num%10;
//            sum+=rem;
//            num=num/10;
//        }
//        return sum;
//    }

    //<---------------------------Optimal Approach(using array as Map of constant size)-------------------------->
    //TimeComplexity: O(n*m) , m = number of digits
    //Space Complexity: O(1)
    private static int getDigitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

    public static int maximumSum(int[] nums) {
        int n = nums.length;
        int result = -1;

        int[] mp = new int[82]; // Since max digit sum is 81

        for (int i = 0; i < n; i++) {
            int digitSum = getDigitSum(nums[i]);

            if (mp[digitSum] > 0) {
                result = Math.max(result, nums[i] + mp[digitSum]);
            }

            mp[digitSum] = Math.max(mp[digitSum], nums[i]);
        }

        return result;
    }
}
