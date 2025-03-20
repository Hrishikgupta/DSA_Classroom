package Leetcode;
//https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/?envType=daily-question&envId=2025-03-19
//leetcode-3191
import java.util.Arrays;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,1,1,0,1,1,1};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int change = 0;
        int i=0;
        i = zeroIndex(nums,i);
        while(i<nums.length-2 && nums[i]==0){
            i = zeroIndex(nums,i);
            //System.out.println(i);
            fliping(nums,i);
            change++;
            //System.out.println(Arrays.toString(nums));
            i = zeroIndex(nums,i);
            //System.out.println(i);
        }
        //System.out.println(Arrays.toString(nums));
        for(int num : nums){
            if(num==0){
                return -1;
            }
        }
        return change;
    }
    public static int zeroIndex(int[] nums, int i){
        while(i<nums.length && nums[i]!=0){
            i++;
        }
        return i;
    }
    public static int[] fliping(int[] nums, int i){
        for(int j=i;j<i+3;j++){
            if(nums[j]==0){
                nums[j]=1;
            }else{
                nums[j]=0;
            }
        }
        return nums;
    }
}
