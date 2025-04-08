package BitwiseOperationsAndNumberSystems;
//Every number is repeating twice , only one number appear once find that number

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(UniqueElement(arr));
    }
    static int UniqueElement(int[] arr){
        int ans = 0;
        for(int num : arr){
            ans = ans^num;
        }
        return ans;
    }
}
