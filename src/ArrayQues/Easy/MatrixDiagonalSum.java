package ArrayQues.Easy;
//leetcode-1572
//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };
        System.out.println(diagonalSum(mat));
    }
    //<----------------------------My Approach------------------------------>
//    public static int diagonalSum(int[][] mat) {
//        int sum = 0;
//
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat[i].length;j++){
//                if(i==j){
//                    sum+=mat[i][j];
//                }
//                if(i+j== mat.length-1){
//                    sum+=mat[i][j];
//                }
//                if(i+j==mat.length-1 && i==j){
//                    sum -= mat[i][j];
//                }
//            }
//        }
//        return sum;
//    }

    //<------------------------------Another Approach------------------------------->
    public static int diagonalSum(int[][] mat){
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][mat.length-i-1];
        }
        if(mat.length%2!=0){
            sum-=mat[(mat.length/2)][(mat.length/2)];
        }
        return sum;
    }
}
