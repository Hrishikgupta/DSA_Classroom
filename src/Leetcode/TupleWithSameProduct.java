package Leetcode;

public class TupleWithSameProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10};
        System.out.println(tupleSameProduct(arr));

    }

    //<-----------------Brute Force Approach---------------------------------------->
    public static int tupleSameProduct(int[] nums) {
        int tuple = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if(i!=k && i!= l && j!=k && j!=l){
                            int p1 = nums[i]*nums[j];
                            int p2 = nums[k] * nums[l];
                            if(p1==p2){
                                tuple++;
                            }
                        }
                    }
                }
            }
        }
        return (tuple/2)*8;
    }
}
