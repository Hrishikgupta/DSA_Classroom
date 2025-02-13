package Leetcode;
//leetcode: 3066
//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/?envType=daily-question&envId=2025-02-13
import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValueII {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums, k));
    }
    //TimeComplexity: O(nlogn)
    //SpaceComplexity: O(n)
    public static  int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int num: nums){
            pq.add((long)num);
        }
        int count = 0;
        while(!pq.isEmpty() && pq.peek()<k){
            long smallest = pq.poll();
            long secondSmallest = pq.poll();
            pq.add(Math.min(smallest,secondSmallest)*2+Math.max(smallest,secondSmallest));
            count++;
        }
        return count;
    }
}
