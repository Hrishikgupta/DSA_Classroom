package ArrayQues.Easy;
//leetcode-1365
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums )));
    }
    //<-------------------My Approach-------------------------------------------->
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] res = new int[nums.length];
//        int count;
//        for(int num=0; num<nums.length; num++){
//            count = 0;
//            for(int check : nums){
//                if(nums[num]>check){
//                    count++;
//                }
//            }
//            res[num]=count;
//        }
//        return res;
//    }

    //<-------------------------Another Approach------------------------------------->
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] frequency = new int[101];
        for(int num : nums){
            frequency[num]++;
        }
        for(int i=1;i<frequency.length;i++){
            frequency[i]+=frequency[i-1];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]==0 ? 0 : frequency[nums[i]-1];
        }
        return result;
    }
}
