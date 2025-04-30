package Recursion.RecursionSubsetSubsequencesAndStringQuestions;

public class RemoveAFromString {
    public static void main(String[] args) {
        String str = "baccadappleghty";
        System.out.println(removeA("",str));
        System.out.println(removeA2(str));
        System.out.println(removeStringApple(str));
        System.out.println(removeStringAppNotApple(str));
    }
    static String removeA(String ans, String str){
         if(str.isEmpty()){
             return ans;
         }
         char ch = str.charAt(0);
         if(ch=='a'){
             return removeA(ans,str.substring(1));
         }else{
             return removeA(ans+ch ,str.substring(1));
         }
    }

    static String removeA2(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return removeA2(str.substring(1));
        }else{
            return ch+removeA2(str.substring(1));
        }
    }

    //Similarly for removing String
    static String removeStringApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return removeStringApple(str.substring(5));
        }else{
            return str.charAt(0)+removeStringApple(str.substring(1));
        }
    }

    static String removeStringAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return removeStringAppNotApple(str.substring(3));
        }else{
            return str.charAt(0)+removeStringAppNotApple(str.substring(1));
        }
    }
}
