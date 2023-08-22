package java5thsem;
import java.util.Arrays;

public class TwoElementsClosestToZero {
    public static void findTwoElementsClosestToZero(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int closestX = 0, closestY = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                closestX = arr[left];
                closestY = arr[right];
            }
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println("The two elements whose sum is closest to zero are: " + closestX + " and " + closestY);
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 60, -10, 70, -80, 85};
        findTwoElementsClosestToZero(inputArray);
    }
}
