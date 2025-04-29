import java.util.ArrayList;
import java.util.Arrays;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,0},
                {0,1,0},
                {0,1,1}
        };
        System.out.println(celebrity(mat));
    }
    public static int celebrity(int mat[][]) {
        // code here
        int top=0;
        int down=mat.length-1;
        while(top<down){
            if(mat[top][down]==1){
                top++;
            }
            else if(mat[down][top]==1){
                down--;
            }
            else{
                top++;
                down--;
            }
        }
        if(top>down)return -1;
        for(int i=0;i<mat.length;i++){
            if(i==top){
                continue;
            }
            if(mat[top][i]==1||mat[i][top]==0) {
                return -1;
            }
        }
        return top;
    }
}
