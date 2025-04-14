package Leetcode;
//https://leetcode.com/problems/count-good-triplets/description/?envType=daily-question&envId=2025-04-14
//leetcode-1534
public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;
        System.out.println(countGoodTriplets(arr,a,b,c));
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k <= n - 1; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
