package java5thsem;

import java.util.Scanner;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int size = arr.length;
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < size && arr[i] <= target) {
            i *= 2;
        }

        int left = i / 2;
        int right = Math.min(i, size - 1);
        return binarySearch(arr, target, left, right);
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
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

        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index + ".");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
