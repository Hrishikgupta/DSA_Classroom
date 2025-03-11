package Leetcode;
//leetcode-1358
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/?envType=daily-question&envId=2025-03-11
public class NumberOfSubStringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String word = "abcabc";
        System.out.println(numberOfSubstrings(word));
    }
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int result = 0;
        int[] mp = new int[3]; // 0 - a, 1 - b, 2 - c

        int i = 0, j = 0;
        while (j < n) {
            char ch = s.charAt(j);
            mp[ch - 'a']++;

            while (mp[0] > 0 && mp[1] > 0 && mp[2] > 0) {
                result += (n - j);
                mp[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }

        return result;
    }
}
