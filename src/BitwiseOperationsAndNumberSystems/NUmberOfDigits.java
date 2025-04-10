package BitwiseOperationsAndNumberSystems;

public class NUmberOfDigits {
    public static void main(String[] args) {
        int n = 15;
        int b = 2;
        System.out.println(digit(n,b));
    }
    static int digit ( int n, int b){
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
}
