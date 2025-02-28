package ArrayQues.Easy;

import java.util.Arrays;

//leetcode-1929
//https://leetcode.com/problems/concatenation-of-array/description/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    //<--------------1st Approach-------------------------->
//    public static int[] getConcatenation(int[] nums) {
//        int[] ans = new int[2*nums.length];
//        for(int i=0;i<2*nums.length;i++){
//            if(i<nums.length){
//                ans[i] = nums[i];
//            }else{
//                ans[i]=nums[i-nums.length];
//            }
//        }
//        return ans;
//    }

    //<-------------------Another Approach------------------------>
//    public static int[] getConcatenation(int[] nums){
//        int[] ans = new int[2*nums.length];
//        for(int i=0;i<nums.length;i++){
//            ans[i]=nums[i];
//            ans[i+nums.length]=nums[i];
//        }
//        return ans;
//    }

    //<------------------Another Approach------------------------>
    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[2*nums.length];
        System.arraycopy(nums,0, ans,0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }

}
