package Recursion.RecursionLv1Questions;

public class CountNumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(20401));
    }
    static int count = 0;
    static int countZeros(int n){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            count++;
        }
        return countZeros(n/10);
    }
}
