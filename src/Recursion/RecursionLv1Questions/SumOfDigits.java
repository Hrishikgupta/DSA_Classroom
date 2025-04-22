package Recursion.RecursionLv1Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1342585));
    }
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        n = n/10;
        return rem + sumOfDigit(n);
    }
}
