package Recursion.RecursionPatternQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        draw_triangle(4,0);
    }
    static void draw_triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r) {
            draw_triangle(r,c+1);
            System.out.print("*" + " ");

        }else{
            draw_triangle(r-1,0);
            System.out.println();

        }
    }
    static void draw_pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r) {
            System.out.print("*" + " ");
            draw_pattern(r,c+1);
        }else{
            System.out.println();
            draw_pattern(r-1,0);
        }
    }
}
