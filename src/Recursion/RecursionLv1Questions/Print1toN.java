package Recursion.RecursionLv1Questions;

public class Print1toN {
    public static void main(String[] args) {
        func(5,1);
    }
    static void func(int n,int i){
        if(i==n){
            System.out.print(n);
            return;
        }
        System.out.println(i);
        func(n,i+1);
    }

    //Calling the function to print once it exit from the stack
    static void func1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        func1(n-1);
        System.out.println(n);
    }
}
