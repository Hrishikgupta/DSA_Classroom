package Leetcode;
//https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11
//leetcode-2843
public class CountSymmetricIntegers {
    public static void main(String[] args) {
        int low = 11;
        int high = 11 ;
        System.out.println(countSymmetricIntegers(low,high));
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while(low <= high){
            int length = (int)(Math.log(low)/Math.log(10)+1);
            //System.out.println(length);
            if((length&1)==1){
                low++;
                continue;
            }
            if(symmetry(length,low)){
                count++;
            }
            low++;
        }
        return count;
    }
    static boolean symmetry(int length, int num){
        int half = length/2;
        int Fsum = 0;
        int Ssum = 0;
        while(half-- > 0){
            int rem = num%10;
            Fsum = Fsum + rem;
            num = num/10;
        }
        half = length/2;
        while(half-- > 0){
            int rem = num%10;
            Ssum = Ssum + rem;
            num = num/10;
        }
        if(Fsum==Ssum){
            return true;
        }
        return false;
    }
}
