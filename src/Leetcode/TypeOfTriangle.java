package Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/type-of-triangle/description/?envType=daily-question&envId=2025-05-19
//leetcode-3024
public class TypeOfTriangle {
    public static void main(String[] args) {
        int[] nums = {8,2,4};
        System.out.println(triangleType2(nums));
    }
    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<nums[2]){
            return "none";
        }
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[1]==nums[2]){
            return "isosceles";
        }else{
            return "scalene";
        }
    }

    public static String triangleType2(int[] nums) {
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[2]+nums[0]<=nums[1]){
            return "none";
        }
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        } else if (nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0]) {
            return "isosceles";
        }else {
            return "scalene";
        }
    }
}
