package Sorting;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int correctidx = nums[i]-1;
                int temp =nums[i];
                nums[i] = nums[correctidx];
                nums[correctidx] = temp;
            }else{
                i++;
            }
        }
        for(int value=0;value<nums.length;value++){
            if(nums[value] != value+1){
                return nums[value];
            }
        }
        return -1;
    }
}
