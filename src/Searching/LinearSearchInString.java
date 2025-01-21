package Searching;
import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "Hrishik";
        char target = sc.next().charAt(0);
        System.out.print(LinearSearch2(word,target));
    }
    static int LinearSearch(String str, char target){
        if(str.length()==0) {
            return -1;
        }
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    static int LinearSearch2(String str, char target){
        if(str.length()==0) {
            return -1;
        }
        int i=0;
        for(char ch:str.toCharArray()){
            if(ch==target){
                return i;
            }
            i++;
        }
        return -1;
    }
}
