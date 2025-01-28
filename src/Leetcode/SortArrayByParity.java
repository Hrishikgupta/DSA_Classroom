package Leetcode;
//leetcode - 905
//https://leetcode.com/problems/sort-array-by-parity/description/
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int i =0;
        int len = nums.length;
        for(int j=0;j<len;j++){
            if(nums[j]%2!=0){
                continue;
            }
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
        }
        return nums;
    }
}
