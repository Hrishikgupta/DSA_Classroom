package Leetcode;
//https://leetcode.com/problems/finding-3-digit-even-numbers/description/?envType=daily-question&envId=2025-05-12
//leetcode-2094
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class Finding3digitsEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        System.out.println(Arrays.toString(findEvenNumbers2(digits)));
    }

    //<---------------Approach 1------------------------->
    //T.C: O(n^3 + slogs) s = total 3 digit even number
    //S.C: o(s)
    public static int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> s = new HashSet<>();
        int n = digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k = 0;k<n;k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    int num = digits[i]*100+digits[j]*10+digits[k]*1;
                    if(num>=100 && num<=999 && (num&1)==0){
                        s.add(num);
                    }
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>(s);
        Collections.sort(result);
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
    }

    //<----------------Approach-2---------------------------->
    //Smarter Approach
    //T.C.: O(1)
    //S.C.: O(1)
    public static int[] findEvenNumbers2(int[] digits) {
        int[] freq = new int[10];
        ArrayList<Integer> result = new ArrayList<>();
        for(int digit : digits){
            freq[digit]++;
        }
        for(int i=1;i<=9;i++){
            if(freq[i]==0){
                continue;
            }
            freq[i]--;
            for(int j=0;j<=9;j++){
                if(freq[j]==0){
                    continue;
                }
                freq[j]--;
                for(int k=0;k<=8;k=k+2){
                    if(freq[k]==0){
                        continue;
                    }
                    freq[k]--;
                    int num = i*100 + j*10 + k;
                    result.add(num);
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
    }
}
