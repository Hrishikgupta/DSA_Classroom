package BitwiseOperationsAndNumberSystems;

public class Set_ith_bit {
    public static void main(String[] args) {
        int n = 86;
        int i = 4;
        System.out.println(Set_ith(n,i));
    }
    static int Set_ith(int n, int i){
        return n|(1<<i-1);
    }
}
