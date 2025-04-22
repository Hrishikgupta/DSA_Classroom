package Recursion.RecursionLv1Questions;

public class ReverseANumber {
    //Way-1
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return ;
        }
        int digit = n%10;
        sum = sum*10+digit;
        reverse(n/10);
    }

    //Way-2
    //Sometimes you might need some additional variables int the arguments
    //in that case make another function
    static int reverse2(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

    //main function
    public static void main(String[] args) {
        reverse(1452);
        System.out.println(sum);
        System.out.println(reverse2(1458));
    }
}
