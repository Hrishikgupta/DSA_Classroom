package ArrayQues.Easy;
//leetcode-867
//https://leetcode.com/problems/transpose-matrix/description/

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,4,-1},
                {-10,5,11},
                {18,-7,6}
        };
        transpose(matrix);
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] mat = new int[matrix[0].length][matrix.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=matrix[j][i];
            }
        }
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat[i].length;j++){
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println();
//        }
        return mat;
    }
}
