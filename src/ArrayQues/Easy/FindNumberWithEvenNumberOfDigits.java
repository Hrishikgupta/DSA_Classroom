package ArrayQues.Easy;
//leetcode-1295
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            int size = (int)Math.log10(num)-1;
            if(size%2==0){
                count++;
            }
        }
        return count;
    }
}
