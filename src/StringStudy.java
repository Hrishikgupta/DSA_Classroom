import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;

public class StringStudy {
    public static void main(String[] args) {
        float a = 432.12345f;
        System.out.printf("Formated number is %.2f",a); //432.12
        System.out.println();

        float b = 432.12745f;
        System.out.printf("Formated mnumber is %.2f",b); //432.13
        System.out.println();

        System.out.println(Math.PI); //3.141592653589793
        System.out.printf("Formated value of pi is %.3f",Math.PI); //3.142
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s","Hrishik","cool");
        System.out.println();

//        %c - character;
//        %d - Decimal number base 10;
//        %e - exponential floating point number;
//        %f - floating point number;
//        %i - Integer(base 10);
//        %o - Octal number;
//        %s - String;
//        %u - unsigned decimal(integer base 10);
//        %x - Hexadecimal Number ( base 16);
//        %t - Date/time;
//        %n - new line;

        System.out.println('a'+'b'); //195
        System.out.println("a"+"b"); //ab
        System.out.println('a'+3); //100
        System.out.println((char)('a'+3)); //d
        System.out.println("a"+1); //a1
        System.out.println("Hrishik"+new ArrayList<>());
        System.out.println("Hrishik"+Integer.valueOf(56));
        //System.out.println(new ArrayList<>() + Integer.valueOf(56));    <Error, because entire is taken as expression and + is act as operator>

        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)+('a'+i);
            series += ch;
        }
        System.out.println(series); //abcdefghijklmnopqrstuvwxyz
        //In for loop it will be
        //[a,ab,abc,abcd,....] all these have no reference variable so wastage only
        //Time Complexity: O(n^2)
        //1+2+3+4+....N => N(N+1)/2 => O(n^2)

        //String Builder => Seperate datatype , which is mutable and we can perform operation in it.
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)+('a'+i);
            builder.append(ch);
        }
        System.out.println(builder); //abcdefghijklmnopqrstuvwxyz

        String name = "Hrishik Gupta";
        System.out.println(Arrays.toString(name.toCharArray())); //[H, r, i, s, h, i, k,  , G, u, p, t, a]

        System.out.println(name.toLowerCase()); //hrishik gupta
        System.out.println(name); //Hrishik Gupta
        System.out.println(name.indexOf('r')); //1
        System.out.println("       Hrishik       ".strip()); //Hrishik
        System.out.println(Arrays.toString(name.split(" "))); //[Hrishik, Gupta]
        System.out.println(Arrays.toString(name.split("i"))); //[Hr, sh, k Gupta]
        System.out.println(Arrays.toString(name.split("")));  //[H, r, i, s, h, i, k,  , G, u, p, t, a]
    }
}
