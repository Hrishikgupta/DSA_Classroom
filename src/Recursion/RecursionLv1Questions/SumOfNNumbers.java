package Recursion.RecursionLv1Questions;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(Summation(5));
    }
    static int Summation(int n){
        if(n==1){
            return 1;
        }
        return n+ Summation(n-1);
    }
}
