package Searching;
import java.util.Arrays;

public class SortedMatrixIn2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 9;
        System.out.println(Arrays.toString(BinarySearchInSortedMatrix(matrix,target)));
    }
    //Search in the row provided
    static int[] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] BinarySearchInSortedMatrix(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==1){
            return BinarySearch(matrix,row,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row -1;
        int cMid = col / 2;

        while(rStart<(rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }

        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //Search in 1st half
        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix,rStart,0,cMid-1,target);
        }
        //Search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
            return BinarySearch(matrix,rStart,cMid + 1,col -1,target);
        }
        //Search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //Search in 4th half
        if(target >= matrix[rStart+1][cMid+1]){
            return BinarySearch(matrix,rStart+1,cMid+1,col-1,target);
        }
        return new int[]{-1,-1};
    }
}
