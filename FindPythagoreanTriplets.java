package java5thsem;
import java.util.HashMap;

public class FindPythagoreanTriplets {
    public static void findPythagoreanTriplets(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> squaresMap = new HashMap<>();
        for (int num : arr) {
            squaresMap.put(num * num, num);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sumOfSquares = arr[i] * arr[i] + arr[j] * arr[j];
                if (squaresMap.containsKey(sumOfSquares)) {
                    int k = squaresMap.get(sumOfSquares);
                    System.out.println("The Pythagorean triplets are: " + arr[i] + ", " + arr[j] + ", " + k);
                    return;
                }
            }
        }
        System.out.println("No such Pythagorean triplets found in the array.");
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 4, 5, 6, 8, 10, 13};
        findPythagoreanTriplets(inputArray);
    }
}
