package BitwiseOperationsAndNumberSystems;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(XORvalue(8));
        int b = 8;
        System.out.println(XORvalueBetweenRange(a,b));
    }
    //XOR value from 0 to a
    static int XORvalue(int a){
        if(a%4==0){
            return a;
        }
        else if(a%4==1){
            return 1;
        }
        else if(a%4==2){
            return a+1;
        }
        else if(a%4==3){
            return 0;
        }
        return -1;
    }

    //XOR value from a to b
    static int XORvalueBetweenRange(int a, int b){
        return XORvalue(b)^XORvalue(a-1);
    }
}
