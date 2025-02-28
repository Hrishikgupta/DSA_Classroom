package ArrayQues.Easy;
//leetcode-1832
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    //<--------------------My Approach------------------------------->

//    public static boolean checkIfPangram(String sentence) {
//        int[] freq = new int[26];
//        for(int i = 0;i<sentence.length();i++){
//            int num = sentence.charAt(i)-'a';
//            freq[num]++;
//        }
//        for(int num: freq){
//            if(num==0){
//                return false;
//            }
//        }
//        return true;
//    }

    //<------------------------Another Approach------------------------------->
    public static boolean checkIfPangram(String sentence){
        if(sentence.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}
