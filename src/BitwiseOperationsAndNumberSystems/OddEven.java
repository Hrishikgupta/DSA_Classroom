package BitwiseOperationsAndNumberSystems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IfEven(n));
    }
    static boolean IfEven(int n){
        return (n & 1) == 0;
    }
}
