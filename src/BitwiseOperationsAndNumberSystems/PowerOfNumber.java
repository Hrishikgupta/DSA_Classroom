package BitwiseOperationsAndNumberSystems;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int exp = 6;
        System.out.println(power(n,exp));
    }
    static int power(int n, int exp){
        int base = n;
        int ans = 1;
        while(exp>0){
            if((exp&1)==1){
                ans *= base;
            }
            base *= base;
            exp = exp>>1;
        }
        return ans;
    }
}
