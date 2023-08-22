package java5thsem;
import java.util.Arrays;

public class FindTwoRepeatingNumbers {
    public static void findTwoRepeatingNumbers(int[] arr, int n) {
        int xorOfAll = 0;
        for (int i = 1; i <= n; i++) {
            xorOfAll ^= i;
        }
        int xorOfArr = 0;
        for (int num : arr) {
            xorOfArr ^= num;
        }
        int rightmostSetBit = xorOfAll & ~(xorOfAll - 1);
        int result1 = 0, result2 = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) == 0) {
                result1 ^= num;
            } else {
                result2 ^= num;
            }
        }
        System.out.println("The two repeating numbers are: " + result1 + " " + result2);
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 2, 4, 5, 2, 3, 1};
        int n = 5;
        findTwoRepeatingNumbers(inputArray, n);
    }
}
