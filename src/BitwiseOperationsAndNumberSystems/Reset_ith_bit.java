package BitwiseOperationsAndNumberSystems;

public class Reset_ith_bit {
    public static void main(String[] args) {
        int n = 86;
        int i = 5;
        System.out.println(reset_ith(n,i));

    }
//    static int reset_ith(int n , int i){
//        int mask = 1<<(i-1);
//        int Complementmask = ~mask;
//        return n&Complementmask;
//    }
    //<-------------------Simplified Way--------------------------->
    static int reset_ith(int n , int i){
        return n&(~(1<<(i-1)));
    }
}
