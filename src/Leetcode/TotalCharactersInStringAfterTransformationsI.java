package Leetcode;
//https://leetcode.com/problems/total-characters-in-string-after-transformations-i/description/?envType=daily-question&envId=2025-05-13
//leetcode-3335
public class TotalCharactersInStringAfterTransformationsI {
    public static void main(String[] args) {
        String s = "abcyy";
        int t = 2;
        System.out.println(lengthAfterTransformations2(s,t));
    }

    //<----------------Brute force approach will get TLE error--------------------->
    public static int lengthAfterTransformations(String s, int t) {
        StringBuilder sb = new StringBuilder(s);
        return lengthcount(sb, t);
    }
    static int lengthcount(StringBuilder sb, int t){
        if(t==0){
            return sb.length();
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='z'){
                sb.replace(i,i+1,"ab");
                i++;
            }else{
                char ch = (char)((int)sb.charAt(i)+1);
                sb.setCharAt(i,ch);
            }
        }
        return lengthcount(sb,t-1);
    }

    //<-----------------Another Approach----------------------------->
    private static final int M = 1_000_000_007;

    public static int lengthAfterTransformations2(String s, int t) {
        int[] mp = new int[26];

        for (char ch : s.toCharArray()) {
            mp[ch - 'a']++;
        }

        for (int count = 1; count <= t; count++) {
            int[] temp = new int[26];

            for (int i = 0; i < 26; i++) {
                char ch = (char) (i + 'a');
                int freq = mp[i];

                if (ch != 'z') {
                    temp[(ch + 1) - 'a'] = (temp[(ch + 1) - 'a'] + freq) % M;
                } else {
                    temp['a' - 'a'] = (temp['a' - 'a'] + freq) % M;
                    temp['b' - 'a'] = (temp['b' - 'a'] + freq) % M;
                }
            }

            mp = temp;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result = (result + mp[i]) % M;
        }

        return result;
    }
}
