package Leetcode;

import java.util.*;
//leetcode-2033
//https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/?envType=daily-question&envId=2025-03-26
public class MinimumOperationToMakeAUniValueGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {2,4},
                {6,8}
        };
        int x = 2;
        System.out.println(minOperations(grid,x));
    }
    public static int minOperations(int[][] grid, int x) {
        List<Integer> s = new ArrayList<>();
        for(int[] nums: grid){
            for(int num : nums){
                s.add(num);
            }
        }
        Collections.sort(s);
        int target = s.get(s.size()/2);
        int count = 0;
        for(int num: s){
            if(num%x != target%x){
                return -1;
            }
            count += Math.abs(target - num) / x;
        }
        return count;
    }
}
