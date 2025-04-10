package BitwiseOperationsAndNumberSystems;

public class FindIfNumberIsPowerOf2orNot {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(powerOf2(n));
        System.out.println(powerOf2a(n));
        System.out.println(powerOf2b(n));
    }
    //<---------------work for n = 0 also--------------------------->
    static boolean powerOf2(int n){
        int count = 0;
        while(n>0){
            int last = n&1;
            if(last==1){
                count++;
            }
            n=n>>1;
        }
        if(count>1 || count == 0){
            return false;
        }
        return true;
    }

    //<---------------work for n = 0 also--------------------------->
    static boolean powerOf2a(int n){
        boolean check = false;
        while(n>0){
            int last = n&1;
            if(check==true && last==1){
                return false;
            }
            if(!check && last == 1){
                check = true;
            }
            n=n>>1;
        }
        return check;
    }

    //<---------------Don't work for n = 0--------------------------->
    static boolean powerOf2b(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}
