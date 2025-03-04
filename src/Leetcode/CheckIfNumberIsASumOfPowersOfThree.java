package Leetcode;
//leetcode-1780
//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=daily-question&envId=2025-03-04
public class CheckIfNumberIsASumOfPowersOfThree {
    public static void main(String[] args) {
        int n = 91;
        System.out.println(checkPowersOfThree(n));
    }
    public static boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3>1){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}
