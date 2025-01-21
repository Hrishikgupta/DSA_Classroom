package ArrayQues;

import java.util.ArrayList;
import java.util.Scanner;

public class KMP_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        String txt = sc.next();
        String pattern = sc.next();
        int[] LPS=new int[pattern.length()];
        LongestPrefixSufix(pattern,LPS);
//        To print LPS array
//        for(int num:LPS){
//            System.out.print(num+" ");
//        }
        int i=0;
        int j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==pattern.length()){
                ls.add(i-pattern.length()+1);
                j=LPS[j-1];
            }
            else if(txt.charAt(i)!=pattern.charAt(j)) {
                if(j!=0){
                    j=LPS[j-1];
                }
                else{
                    i++;
                }
            }
        }
        System.out.print(ls);
    }
    static void LongestPrefixSufix(String pattern,int[] LPS){
        //int[] LPS = new int[pattern.length()];
        LPS[0]=0;
        int length = 0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(length)){
                length++;
                LPS[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length = LPS[length-1];
                }
                else{
                    LPS[i]=0;
                    i++;
                }
            }
        }

        //return LPS;
    }
}
