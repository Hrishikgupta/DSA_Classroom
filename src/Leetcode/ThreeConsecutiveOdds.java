package Leetcode;
//https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2025-05-11
//leetcode-1550
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] nums = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(nums));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==0){
                n=0;
                continue;
            }else{
                n++;
            }
            if(n==3){
                return true;
            }
        }
        return false;
    }
}
