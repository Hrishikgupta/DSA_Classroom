package Leetcode;
//leetcode - 2658
//https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/description/
import java.util.LinkedList;
import java.util.Queue;

public class MaximumNumberOfFishInAGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {2,0,5}
        };
        System.out.println(findMaxFish(grid));
    }

    static int bfs(int i, int j, int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        int fishCount = grid[i][j];
        grid[i][j] = 0;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            i = cell[0];
            j = cell[1];

            for (int[] dir : directions) {
                int i_ = i + dir[0];
                int j_ = j + dir[1];

                if (i_ >= 0 && j_ >= 0 && i_ < m && j_ < n && grid[i_][j_] > 0) {
                    queue.offer(new int[]{i_, j_});
                    fishCount += grid[i_][j_];
                    grid[i_][j_] = 0;
                }
            }
        }

        return fishCount;
    }

    static int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxFish = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) { // water cell found
                    maxFish = Math.max(maxFish, bfs(i, j, grid));
                }
            }
        }

        return maxFish;
    }
}
