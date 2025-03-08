package Leetcode;
//leetcode-2379
//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/?envType=daily-question&envId=2025-03-08
public class MinimumRecoloursToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String blocks = "WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW";
        int k = 15;
        System.out.println(minimumRecolors(blocks,k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int result = k;

        for (int i = 0; i <= n - k; i++) {
            int W = 0;
            for (int j = i; j - i + 1 <= k; j++) {
                if (blocks.charAt(j) == 'W') {
                    W++;
                }
            }
            result = Math.min(result, W);
        }

        return result;
    }
}
