package Leetcode;
//leetcode-2206
//https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=daily-question&envId=2025-03-17
import java.util.HashMap;
import java.util.Map;

public class DivideAnArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    //<---------------------1st Approach------------------------------>
//    public static boolean divideArray(int[] nums) {
//        int[] arr = new int[501];
//        for(int i=0;i<nums.length;i++){
//            arr[nums[i]]++;
//        }
//        for(int num : arr){
//            if(num%2!=0){
//                return false;
//            }
//        }
//        return true;
//    }
    //<-----------------Trying with map---------------------->
    public static boolean divideArray(int[] nums){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
                continue;
            }
            mp.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> map1 : mp.entrySet()){
            int val = map1.getValue();
            if(val%2!=0){
                return false;
            }
        }
        return true;
    }
}
