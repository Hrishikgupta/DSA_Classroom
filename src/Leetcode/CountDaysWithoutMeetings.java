package Leetcode;
//leetcode-3169
//https://leetcode.com/problems/count-days-without-meetings/description/?envType=daily-question&envId=2025-03-24
import java.util.Arrays;

public class CountDaysWithoutMeetings {
    public static void main(String[] args) {
        int days = 6;
        int[][] meetings = {
                {1,6}
        };
        System.out.println(countDays(days,meetings));
    }
    //<---------------------Self Approach-------------------------------------->
    //<--------------------------563/578 testcases passes and got TLE error------------------->
//    public static int countDays(int days, int[][] meetings) {
//        boolean[] arr = new boolean[days+1];
//        arr[0]=true;
//        for(int[] meet : meetings){
//            int start = meet[0];
//            int end = meet[1];
//            mark(arr, start, end);
//        }
//        int count = 0;
//        for(boolean ch : arr){
//            if(ch == false){
//                count++;
//            }
//        }
//        return count;
//    }
//    static void mark(boolean[] arr, int start, int end){
//        for(int i=start;i<=end;i++){
//            if(arr[i]==false){
//                arr[i]=true;
//            }
//        }
//    }

    //<----------------------Simple sorting based on starting point----------------------->
    //T.C:O(nlogn)
    //S.C:O(1)
    public static int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int end = 0;

        for (int[] meet : meetings) {
            if (meet[0] > end) {
                result += meet[0] - end - 1;
            }
            end = Math.max(end, meet[1]);
        }

        if (days > end) {
            result += days - end;
        }

        return result;
    }
}
