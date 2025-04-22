package MathsForDSA;

import java.util.ArrayList;

public class FactorsOfANUmber {
    public static void main(String[] args) {
       factors3(36);
    }

    //TimeComplexity: O(n)
    static void factors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    //Time Complexity: O(sqrt(n))
    static void factors2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    //In factors we got the factors but it's not sorted so now we will sort it too
    //Time and space complexity: O(sqrt(n))
    static void factors3(int n ){
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    ls.add(n/i);
                }
            }
        }
        for(int i = ls.size()-1;i>=0;i--){
            System.out.print(ls.get(i)+" ");
        }
    }
}
