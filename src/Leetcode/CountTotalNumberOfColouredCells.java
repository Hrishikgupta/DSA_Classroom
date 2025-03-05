package Leetcode;
//leetcode-2579
//https://leetcode.com/problems/count-total-number-of-colored-cells/?envType=daily-question&envId=2025-03-05
public class CountTotalNumberOfColouredCells {
    public static void main(String[] args) {
        System.out.println(coloredCells(3));
    }
    public static long coloredCells(int n) {
        int t = 1;
        long cells = 1;

        while (t <= n) {
            cells += (4L * (t - 1));
            t++;
        }

        return cells;
    }
}
