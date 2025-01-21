import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(2,3,"Hrishik","Harsh","Kunal");
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(a+" "+b+Arrays.toString(v));
    }
}
