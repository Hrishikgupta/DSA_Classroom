package Leetcode;
//leetcode - 1267
//https://leetcode.com/problems/count-servers-that-communicate/description/

public class CountServersthatCommunicate {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        System.out.println(countServers(grid));
    }
    //<--------------------------------------Better Approach--------------------------------------------->
    //T.C. : O(m*n)
    //S.C. : O(m+n)
    static int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count_server = 0;
        int[] row_server = new int[m];
        int[] col_server = new int[n];

        for(int row=0;row<m;row++){
            for(int col = 0;col<n;col++){
                if(grid[row][col]==1){
                    row_server[row]++;
                    col_server[col]++;
                }
            }
        }
        for(int row = 0;row<m;row++){
            for(int col = 0;col<n;col++){
                if(grid[row][col]==1 && (row_server[row]>1 || col_server[col]>1)){
                    count_server++;
                }
            }
        }
        return count_server;
    }
    //<---------------------------------------------- BruteForce Approach------------------------------------>
    //T.C. : O(m*n)*(m+n)
    //S.C. : O(1)
//    static int countServers(int[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        int count_server = 0;
//        for(int i=0;i<m;++i){
//            for(int j=0;j<n;++j){
//                if(grid[i][j]==1){
//                    boolean canCommunicate = false;
//                    for(int col = 0;col<n;++col){
//                        if(col != j && grid[i][col]==1){
//                            canCommunicate = true;
//                            break;
//                        }
//                    }
//                    if(canCommunicate){
//                        count_server++;
//                    }else{
//                        for(int row = 0;row<m;++row){
//                            if(row != i && grid[row][j]==1){
//                                canCommunicate = true;
//                                break;
//                            }
//                        }
//                        if(canCommunicate){
//                            count_server++;
//                        }
//                    }
//                }
//            }
//        }
//        return count_server;
//    }
}
