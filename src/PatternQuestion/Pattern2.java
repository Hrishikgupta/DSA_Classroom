package PatternQuestion;

//input n = 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

public class Pattern2 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
