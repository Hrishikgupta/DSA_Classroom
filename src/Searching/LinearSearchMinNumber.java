package Searching;
public class LinearSearchMinNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(MinNum(arr));
    }
    static int MinNum(int[] arr){
        int min = Integer.MAX_VALUE;
        if(arr.length == 0){
            return min;
        }
        for(int num:arr){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
}
