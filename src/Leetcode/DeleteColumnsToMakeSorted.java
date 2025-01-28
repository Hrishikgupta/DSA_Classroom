package Leetcode;
//leetcode - 944
//https://leetcode.com/problems/delete-columns-to-make-sorted/description/
public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] strs = {"rrjk","furt","guzm"};
        System.out.println(minDeletionSize(strs));
    }
    static int minDeletionSize(String[] strs) {
        int n = strs.length;
        int len = strs[0].length();
        int count = 0;
        for(int col=0;col<len;col++){
            for(int row = 0;row<n-1;row++){
                if(strs[row].charAt(col)>strs[row+1].charAt(col)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
