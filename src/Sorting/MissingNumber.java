package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));

    }
    static int missingNumber(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums.length){
                i++;
                continue;
            }
            if(nums[i]!=nums[nums[i]]){
                int correctidx = nums[i];
                int temp = nums[i];
                nums[i]= nums[correctidx];
                nums[correctidx]= temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return nums.length;
    }
}
