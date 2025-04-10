package BitwiseOperationsAndNumberSystems;

public class FindTheithBitOfANumber {
    public static void main(String[] args) {
        int i = 4;
        int n = 182;
        System.out.println(bitValue(n,i));
    }
    static int bitValue(int n , int i){
        return (n&(1<<i-1));
    }
}
