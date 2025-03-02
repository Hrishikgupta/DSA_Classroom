package Leetcode;
//leetcode-2460
//https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] num = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(Arrays.toString(applyOperations(num)));
    }
    public static int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
//        int start=0;
//        int end = nums.length-1;
//        while(start<end){
//            while(start<nums.length && nums[start]!=0){
//                start++;
//            }
//            while(end>=0 && nums[end]==0){
//                end--;
//            }
//            if(start<end) {
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//            }
//        }
        List<Integer> ls = new ArrayList<>();
        for(int n : nums){
            if(n!=0){
                ls.add(n);
            }
        }
        int[] res = new int[nums.length];
        for(int i=0;i<ls.size();i++){
            res[i]= ls.get(i);
        }
        return res;
    }
}
