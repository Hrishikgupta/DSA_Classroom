package Recursion.RecursionLv1Questions;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(ProdOfDigit(1456));
    }
    static int ProdOfDigit(int n){
        if(n==0){
            return 1;
        }
        int rem = n%10;
        n = n/10;
        return rem * ProdOfDigit(n);
    }
}
