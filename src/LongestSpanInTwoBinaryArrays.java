import java.util.HashMap;

public class LongestSpanInTwoBinaryArrays {
    public static void main(String[] args) {
        int[] a1 = {0, 1, 0, 0, 0, 0};
        int[] a2 = {1, 0, 1, 0, 0, 1};
        System.out.println(longestCommonSum1(a1, a2));
    }

    public static int longestCommonSum1(int[] a1, int[] a2){
        int n=a1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,-1);
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=a1[i]-a2[i];
            if(map.containsKey(sum)) ans=Math.max(ans,i-map.get(sum));
            else map.put(sum,i);
        }
        return ans;
    }
}
