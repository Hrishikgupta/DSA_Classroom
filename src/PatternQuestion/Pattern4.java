package PatternQuestion;

//Input n = 5
//                1
//                1 2
//                1 2 3
//                1 2 3 4
//                1 2 3 4 5

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
