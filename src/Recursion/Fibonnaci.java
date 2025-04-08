package Recursion;

public class Fibonnaci {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            //System.out.print(fibo(i)+" ");
            System.out.print(fiboUsingFormulla(i)+ " ");
            System.out.println(fiboUsingFormulla2(i));
        }
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    static int fiboUsingFormulla(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    //Removing the less dominating term from formulla
    static int fiboUsingFormulla2(int n){
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
