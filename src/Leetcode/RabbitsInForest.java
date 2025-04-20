package Leetcode;
//https://leetcode.com/problems/rabbits-in-forest/description/?envType=daily-question&envId=2025-04-20
//leetcode-781
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RabbitsInForest {
    public static void main(String[] args) {
        int[] answers = {0,0,1,1,1};
        System.out.println(numRabbits(answers));
    }
    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : answers) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int total = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();      // The answer given by rabbit
            int count = entry.getValue(); // How many rabbits gave that answer

            int groupSize = x + 1;
            int groups = (int) Math.ceil((double) count / groupSize);

            total += groups * groupSize;
        }

        return total;
    }
}
