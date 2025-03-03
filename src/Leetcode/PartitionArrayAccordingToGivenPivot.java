package Leetcode;
//leetcode-2161
//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/?envType=daily-question&envId=2025-03-03
import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                res[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                res[j]=nums[i];
                j++;
            }
        }
        return res;
    }
}
