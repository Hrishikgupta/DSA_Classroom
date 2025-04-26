package Recursion.RecursionArrayQuestions;
//     s             e
//     0,1,2,3,4,5,6,7
//arr=[5,6,7,8,9,1,2,3]
//i}  if arr[s] <= arr[mid]
//         if(key >= arr[s] && key<=arr[mid])
//             end = mid-1
//         else{
//             s = mid +1
//        }

//ii}   if(key >= arr[mid] && key <= arr[e])
//            s = mid +1

//iii}    else{
//           e=m-1;
//        }

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return search(arr, target, s, mid-1);
            }
            else{
                return search(arr, target, mid+1, e);
            }
        }
        if(target>=arr[mid] && target <= arr[e]){
            return search(arr, target, mid+1,e);
        }
        return search(arr, target, s, mid-1);
    }
}
