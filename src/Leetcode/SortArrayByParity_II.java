package Leetcode;
//leetcode - 922
//https://leetcode.com/problems/sort-array-by-parity-ii/description/
import java.util.Arrays;

public class SortArrayByParity_II {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && even<=nums.length){
                arr[even]=nums[i];
                even+=2;
            }
            else{
                if(odd<=nums.length) {
                    arr[odd] = nums[i];
                    odd += 2;
                }
            }
        }
        return arr;
    }
}
