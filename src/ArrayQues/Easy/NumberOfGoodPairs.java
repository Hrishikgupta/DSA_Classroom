package ArrayQues.Easy;
//leetcode-1512
//https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int count = 0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
