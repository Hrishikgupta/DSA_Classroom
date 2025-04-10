package BitwiseOperationsAndNumberSystems;

public class FindNumberOfSetBits {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));
        //<----------------Another Way------------------->
//        while(n>0){
//            int last = n&1;
//            if(last==1){
//                count++;
//            }
//            n = n>>1;
//        }

        //<---------------Another Way------------------------>
//        while(n>0){
//            count++;
//            n = n&(n-1);
//        }

        //<------------------Another Way------------------->
        while(n>0){
            count++;
            n-=(n&(-n));
        }
        System.out.println(count);
    }
}
