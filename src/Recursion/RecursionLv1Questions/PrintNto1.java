package Recursion.RecursionLv1Questions;

public class PrintNto1 {
    public static void main(String[] args) {
        //func(5);
        System.out.println(concept(5));
    }
    //Concept Of passing number

    static int concept(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        //return concept(n--);       //It will goes into infinte loop because it gives values first and then subtract
        return concept(--n);
    }
    static int func(int n){
        if(n==1){
            System.out.print(1);
            return 0;
        }
        System.out.println(n);
        return func(n-1);
    }
}
