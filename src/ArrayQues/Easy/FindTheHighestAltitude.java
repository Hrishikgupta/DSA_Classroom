package ArrayQues.Easy;
//leetcode-1732
//https://leetcode.com/problems/find-the-highest-altitude/description/

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;
        for(int num:gain){
            sum += num;
            res = Math.max(res,sum);
        }
        return res;
    }
}
