package Recursion.RecursionSubsetSubsequencesAndStringQuestions;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        subSequenceASCII("","abc");
        System.out.println(subSequenceRet("","abc"));
    }
    static void subSequenceASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSequenceASCII(p+ch,up.substring(1));
        subSequenceASCII(p,up.substring(1));
        subSequenceASCII(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subSequenceRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String>  first =subSequenceRet(p+ch,up.substring(1));
        ArrayList<String> second =subSequenceRet(p,up.substring(1));
        ArrayList<String> third = subSequenceRet(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
