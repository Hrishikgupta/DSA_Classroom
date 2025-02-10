package Leetcode;
//leetcode - 3174
//https://leetcode.com/problems/clear-digits/description/?envType=daily-question&envId=2025-02-10

public class ClearDigit {
    public static void main(String[] args) {
        String s = "cb34";
        //System.out.println((int)'1');
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if((int)ch>=48 && (int)ch<=57){
                if(ans.isEmpty()){
                    continue;
                }else{
                    ans.deleteCharAt(ans.length()-1);
                    continue;
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}
