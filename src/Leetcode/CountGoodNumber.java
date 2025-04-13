package Leetcode;
//https://leetcode.com/problems/count-good-numbers/?envType=daily-question&envId=2025-04-13
//leetcode-1922
public class CountGoodNumber {
    public static void main(String[] args) {
        long n = 1;
        System.out.println(countGoodNumbers(n));
    }
    static final int M = (int)1e9 + 7;

    private static long findPower(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long half = findPower(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }
    public static int countGoodNumbers(long n) {
        long oddPositions = (n + 1) / 2;
        long evenPositions = n / 2;

        long result = (findPower(5, oddPositions) * findPower(4, evenPositions)) % M;
        return (int) result;
    }
}
