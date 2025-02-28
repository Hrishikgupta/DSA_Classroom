package ArrayQues.Easy;
//leetcode-1389
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] target = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,target)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            ls.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < ls.size(); i++)
            arr[i] = ls.get(i);

        return arr;
    }

}
