package ArrayQues.Easy;
//leetcode-1431
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int num : candies){
            max = Math.max(max,num);
        }
        for(int num : candies){
            int candy = num + extraCandies;
            if(candy >= max){
                ls.add(true);
            }else{
                ls.add(false);
            }
        }
        return ls;
    }
}
