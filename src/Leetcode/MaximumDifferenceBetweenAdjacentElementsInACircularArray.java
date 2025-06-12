package Leetcode;
//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/?envType=daily-question&envId=2025-06-12
//leetcode-3423
public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(maxAdjacentDistance(arr));
    }
    public static int maxAdjacentDistance(int[] nums) {
        int ans = 0;
        for(int i=1;i<nums.length;i++){
            ans = Math.max(Math.abs(nums[i]-nums[i-1]), ans);
        }
        return Math.max(Math.abs(nums[nums.length-1]-nums[0]), ans);
    }
}
