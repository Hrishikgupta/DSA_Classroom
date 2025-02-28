package ArrayQues.Easy;
//leetcode-1773
//https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int check;
        if(ruleKey.equals("type")){
            check = 0;
        } else if (ruleKey.equals("color")) {
            check = 1;
        }else{
            check = 2;
        }
        int count = 0;
        for(int i=0;i<items.size();i++){
            List<String> innerList = items.get(i);
            if(innerList.get(check).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
