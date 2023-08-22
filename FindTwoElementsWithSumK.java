package java5thsem;
import java.util.HashSet;

public class FindTwoElementsWithSumK {
    public static void findTwoElementsWithSumK(int[] arr, int K) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = K - num;
            if (set.contains(complement)) {
                System.out.println("The two elements with sum " + K + " are: " + num + " and " + complement);
                return;
            }
            set.add(num);
        }
        System.out.println("No such elements found with sum " + K + " in the array.");
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 2, 8, 6, 10, 1, 3};
        int K = 10;
        findTwoElementsWithSumK(inputArray, K);
    }
}


//public class FindTwoElementsWithSumK {
//    public static void findTwoElementsWithSumK(int[] arr, int K) {
//        Arrays.sort(arr);
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int sum = arr[left] + arr[right];
//            if (sum == K) {
//                System.out.println("The two elements with sum " + K + " are: " + arr[left] + " and " + arr[right]);
//                return;
//            } else if (sum < K) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        System.out.println("No such elements found with sum " + K + " in the array.");
//    }
//
//    public static void main(String[] args) {
//        int[] inputArray = {4, 2, 8, 6, 10, 1, 3};
//        int K = 10;
//        findTwoElementsWithSumK(inputArray, K);
//    }
//}
