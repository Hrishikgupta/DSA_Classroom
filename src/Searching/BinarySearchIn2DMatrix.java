package Searching;
import java.util.*;
public class BinarySearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(Search2DMatrix(matrix,target)));
    }

    static int[] Search2DMatrix(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target) {
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
