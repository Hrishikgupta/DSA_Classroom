package PatternQuestion;
//Input n = 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for(int row = 1; row <= 2*n-1;row++){
            if(row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }else {
                for(int col=2*n-row;col>=1;col--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
