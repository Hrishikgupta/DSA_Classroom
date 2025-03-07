package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//leetcode-2523
//https://leetcode.com/problems/closest-prime-numbers-in-range/description/?envType=daily-question&envId=2025-03-07
public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left = 11;
        int right = 19;
        System.out.println(Arrays.toString(closestPrimes(left,right)));
    }
    public static int[] closestPrimes(int left, int right) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i%2==0){
                continue;
            }
            if(isPrime(i)){
                if(!ls.isEmpty() && i<=ls.get(ls.size()-1)+2){
                    return new int[] {ls.get(ls.size()-1),i};
                }
                ls.add(i);
            }
        }
        if(ls.size()<2){
            return new int[]{-1,-1};
        }
        int mindiff = Integer.MAX_VALUE;
        int[] pair = new int[2];
        for(int i=1;i<ls.size();i++){
            int diff = ls.get(i)-ls.get(i-1);
            if(diff<mindiff){
                mindiff=diff;
                pair[0]=ls.get(i-1);
                pair[1]=ls.get(i);
            }
        }
        return pair;
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
