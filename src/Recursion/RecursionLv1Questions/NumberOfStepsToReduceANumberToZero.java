package Recursion.RecursionLv1Questions;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//leetcode-1342
public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    static int count = 0;
    public static int numberOfSteps(int num) {
        if(num==0){
            return count;
        }
        if((num&1)==0){
            count++;
            return numberOfSteps(num/2);
        }
        count++;
        return numberOfSteps(num-1);
    }
}
