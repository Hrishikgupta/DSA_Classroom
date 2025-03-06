package Leetcode;
//leetcode-2965
//https://leetcode.com/problems/find-missing-and-repeated-values/description/?envType=daily-question&envId=2025-03-06
import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = {
                {1,3},
                {2,2}
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n; // total elements

        HashMap<Integer, Integer> map = new HashMap<>();

        int a = -1;
        int b = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        //[1...N]
        for (int num = 1; num <= N; num++) {
            if (!map.containsKey(num)) {
                b = num;
            } else if (map.get(num) == 2) {
                a = num;
            }

            if (a != -1 && b != -1) {
                break;
            }
        }

        return new int[]{a, b};
    }
}
