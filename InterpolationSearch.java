package java5thsem;

import java.util.Scanner;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right && target >= arr[left] && target <= arr[right]) {
            if (left == right) {
                if (arr[left] == target) {
                    return left;
                }
                return -1;
            }

            int pos = left + (((target - arr[left]) * (right - left)) / (arr[right] - arr[left]));

            if (arr[pos] == target) {
                return pos;
            }

            if (arr[pos] < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array (in sorted order): ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target to search for: ");
        int target = scanner.nextInt();
        int index = interpolationSearch(arr, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index + ".");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
