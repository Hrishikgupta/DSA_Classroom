package ArrayQues.Easy;

//leetcode-832
//https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image= {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] res = flipAndInvertImage(image);
        for(int[] num:image){
            for(int n : num){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //flip image horizontally without extra space
        for(int i=0;i<image.length;i++){
            int left = 0;
            int right = image[i].length-1;
            while(left<right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        //invert the number in image
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }

        return image;
    }
}
