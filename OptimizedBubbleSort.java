package java5thsem;
import java.util.*;

public class OptimizedBubbleSort {

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop to control the number of passes through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare and swap adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Mark that a swap has occurred in this pass
                    swapped = true;
                }
            }

            // If no two elements were swapped in this pass, the array is already partially sorted
            // So, we can break out of the loop early
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the Unsorted Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        optimizedBubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
