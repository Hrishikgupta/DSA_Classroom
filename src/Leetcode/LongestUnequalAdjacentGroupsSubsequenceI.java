package Leetcode;
//https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/?envType=daily-question&envId=2025-05-15
//leetcode-2900
import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {
        String[] words = {"a","b","c","d"};
        int[] groups = {1,0,1,1};
        System.out.println(getLongestSubsequence(words,groups));
    }
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int cur_value = groups[0];
        result.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(cur_value==groups[i]){
                continue;
            }
            result.add(words[i]);
            cur_value=groups[i];
        }
        return result;
    }
}
