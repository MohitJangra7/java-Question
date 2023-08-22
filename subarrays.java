package java5thsem;

import java.util.Scanner;

public class subarrays {

    public static int[][] findAllSubarrays(int[] nums) {
        int n = nums.length;
        int numSubarr = n * (n + 1) / 2;

        int[][] result = new int[numSubarr][];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subarraySize = j - i + 1;
                result[index] = new int[subarraySize];
                for (int k = i, l = 0; k <= j; k++, l++) {
                    result[index][l] = nums[k];
                }
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[][] subarr = findAllSubarrays(nums);

        for (int[] subarray : subarr) {
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
