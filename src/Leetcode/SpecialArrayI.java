package Leetcode;
//leetcode - 3151
//https://leetcode.com/problems/special-array-i/description/?envType=daily-question&envId=2025-02-01
public class SpecialArrayI {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        System.out.println(isArraySpecial(nums));

    }
    public static boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]%2==0 && nums[i+1]%2==0){
                return false;
            }else if(nums[i]%2!=0 && nums[i+1]%2!=0){
                return false;
            }
        }
        return true;
    }
}
