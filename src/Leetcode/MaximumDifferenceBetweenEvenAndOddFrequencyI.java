package Leetcode;
//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/?envType=daily-question&envId=2025-06-10
//leetcode-3442
import java.util.ArrayList;
import java.util.Collections;

public class MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public static void main(String[] args) {
        String s = "aaaaabbc";
        System.out.println(maxDifference(s));
    }
    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        //System.out.println(Arrays.toString(freq));
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int num : freq){
            if((num&1) == 0 && num!=0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        return Collections.max(odd)-Collections.min(even);
    }
}
