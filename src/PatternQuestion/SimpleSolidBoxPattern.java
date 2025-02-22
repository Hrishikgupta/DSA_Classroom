package PatternQuestion;

//Pattern sample for input n = 5
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

public class SimpleSolidBoxPattern {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
