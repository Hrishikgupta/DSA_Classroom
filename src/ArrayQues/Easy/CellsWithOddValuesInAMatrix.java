package ArrayQues.Easy;
//leetcode-1252
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m=2;
        int n =3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count=0;
        for(int i=0;i<indices.length;i++){
            int row = indices[i][0];
            int col = indices[i][1];
            increment(matrix,row,col);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
            System.out.println();
        }
        return count;
    }
    static int[][] increment(int[][] matrix,int row, int col){
        for(int i = 0;i<matrix[row].length;i++){
            matrix[row][i]++;
        }
        for(int j=0;j<matrix.length;j++){
            matrix[j][col]++;
        }
        return matrix;
    }
}
