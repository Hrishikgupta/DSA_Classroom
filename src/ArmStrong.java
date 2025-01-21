import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isArmStrong(n));
    }
    static boolean isArmStrong(int n){
        int temp = n;
        int sum =0;
        while(temp>0){
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem,3);
            temp = temp/10;
        }
        return sum==n;
    }
}
