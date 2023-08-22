package java5thsem;
import java.util.Arrays;

public class ThreeSumClosestToZero {
    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] inputArray = {-1, 2, 1, -4, 5};
        int target = 1;
        int closestSum = threeSumClosest(inputArray, target);
        System.out.println("The closest sum to " + target + " is: " + closestSum);
    }
}
