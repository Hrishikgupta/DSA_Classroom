package Leetcode;
//leetcode-2570
//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        int[][] nums1 = {
                {1,2},
                {2,3},
                {4,5}
        };
        int[][] nums2 = {
                {1,4},
                {3,2},
                {4,1}
        };
        int[][] res = mergeArrays(nums1,nums2);
        for(int[] num : res){
            System.out.println(Arrays.toString(num));
        }
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0,j=0;
        List<int[]> ls = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            int id1 = nums1[i][0] , val1 = nums1[i][1];
            int id2 = nums2[j][0] , val2 = nums2[j][1];
            if(id1<id2){
                ls.add(new int[] {id1,val1});
                i++;
            } else if (id1>id2) {
                ls.add(new int[] {id2,val2});
                j++;
            }else{
                ls.add(new int[] {id1,val1+val2});
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            ls.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            ls.add(nums2[j]);
            j++;
        }
        int[][] result = new int[ls.size()][2];
        for (int k = 0; k < ls.size(); k++) {
            result[k] = ls.get(k);
        }

        return result;
    }
}
