package ArrayQues.Easy;
//leetcode-989
//https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger num1 = BigInteger.ZERO;
        for(int n : num){
            num1 = (num1.multiply(BigInteger.TEN).add(BigInteger.valueOf(n)));
        }
        //System.out.println(num1);
        num1=num1.add(BigInteger.valueOf(k));
        //System.out.println(num1);
        ArrayList<Integer> ls = new ArrayList<>();
        while (num1.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divideAndRemainder = num1.divideAndRemainder(BigInteger.TEN);
            ls.add(divideAndRemainder[1].intValue());
            num1 = divideAndRemainder[0];
        }
        return ls.reversed();
    }
}
