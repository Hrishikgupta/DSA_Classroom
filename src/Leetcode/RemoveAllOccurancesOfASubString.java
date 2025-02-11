package Leetcode;
//leetcode-1910
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/?envType=daily-question&envId=2025-02-11
import java.util.Stack;

public class RemoveAllOccurancesOfASubString {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));  // Final result after all occurrences are removed
    }

    private static boolean check(Stack<Character> st, String part, int n) {
        Stack<Character> tempSt = new Stack<>();
        tempSt.addAll(st);

        for (int idx = n - 1; idx >= 0; idx--) {
            if (tempSt.peek() != part.charAt(idx)) {
                return false;
            }

            tempSt.pop();
        }

        return true;
    }

    public static String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int m = s.length();
        int n = part.length();

        for (int i = 0; i < m; i++) {
            st.push(s.charAt(i));

            if (st.size() >= n && check(st, part, n)) {
                for (int j = 0; j < n; j++) {
                    st.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.reverse().toString();
    }
}
