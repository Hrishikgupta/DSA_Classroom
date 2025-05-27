package Leetcode;
//https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/?envType=daily-question&envId=2025-05-27
//leetcode-2894
public class DivisibleAndNondivisibleSumsDifference {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n,m));
    }
    public static int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum2 += i;
            }else{
                sum1 += i;
            }
        }
        return sum1-sum2;
    }
}
