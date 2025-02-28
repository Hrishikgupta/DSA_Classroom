package ArrayQues.Easy;
//leetcode-1470
//https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,(nums.length/2))));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0;
        int j=n;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                ans[k]=nums[i];
                i++;
            }else{
                ans[k]=nums[j];
                j++;
            }
        }
        return ans;
    }
}
