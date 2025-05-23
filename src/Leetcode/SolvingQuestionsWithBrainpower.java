package Leetcode;
//https://leetcode.com/problems/solving-questions-with-brainpower/description/?envType=daily-question&envId=2025-04-01
//leetcode - 2140
public class SolvingQuestionsWithBrainpower {
    public static void main(String[] args) {
        int[][] questions = {
                {3,2},
                {4,3},
                {4,4},
                {2,5}
        };
        System.out.println(mostPoints(questions));
    }
    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        if(n==1){
            return questions[0][0];
        }
        long[] t = new long[200001];
        for(int i=n-1;i>=0;i--){
            t[i]= Math.max(questions[i][0] + t[i+questions[i][1]+1],t[i+1]);
        }
        return t[0];
    }
}
