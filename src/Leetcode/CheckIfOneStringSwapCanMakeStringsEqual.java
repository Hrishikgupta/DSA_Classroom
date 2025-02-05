package Leetcode;
//leetcode - 1790
//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05
public class CheckIfOneStringSwapCanMakeStringsEqual {
//    public static void main(String[] args) {
//        String s1 = "npv";
//        String s2 = "zpn";
//        System.out.println(areAlmostEqual(s1,s2));
//    }

//    public static boolean areAlmostEqual(String s1, String s2) {
//        if(s1.equals(s2)){
//            return true;
//        }
//        int first = -1, second = -1;
//        int diff_count = 0;
//        for(int i=0;i<s1.length();i++){
//            if(s1.charAt(i)!=s2.charAt(i)){
//                diff_count++;
//                if(diff_count>2){
//                    return false;
//                }
//                if(first == -1){
//                    first = i;
//                }else{
//                    second = i;
//                }
//            }
//        }
//
//        return diff_count==2 &&
//                s1.charAt(first)==s2.charAt(second) &&
//                s1.charAt(second)==s2.charAt(first);
//    }
    //<---------------------Using StringBuilder instead of String because StringBuilder is mutable--------------------->

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("npv");
        StringBuilder s2 = new StringBuilder("zpn");
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(StringBuilder s1, StringBuilder s2) {
        if (s1.toString().equals(s2.toString())) {
            return true;
        }

        int first = -1, second = -1;
        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 2) return false;  // More than 2 mismatches → return false

                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // Exactly 2 mismatches, swap and check
        if (diffCount == 2) {
            char ch1 = s1.charAt(first), ch2 = s1.charAt(second);
            s1.setCharAt(first, ch2);
            s1.setCharAt(second, ch1);
        }

        return s1.toString().equals(s2.toString());
    }

}

