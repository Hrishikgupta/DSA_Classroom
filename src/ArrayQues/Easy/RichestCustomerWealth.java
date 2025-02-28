package ArrayQues.Easy;
//leetcode-1672
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(nums));
    }
    public static int maximumWealth(int[][] accounts) {
        int sum;
        int max = Integer.MIN_VALUE;
        for(int[] person : accounts){
            sum = 0;
            for(int wealth: person){
                sum+=wealth;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
