package java5thsem;

import java.util.Scanner;

public class subarr_with_sum_k {

    public static int[][] findSubarraysWithSum(int[] nums, int target) {
        int[][] result = new int[nums.length][];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    int subarraySize = j - i + 1;
                    int[] subarr= new int[subarraySize];
                    for (int k = i, l = 0; k <= j; k++, l++) {
                        subarr[l] = nums[k];
                    }
                    result[count++] = subarr;
                }
            }
        }

        int[][] finalResult = new int[count][];
        System.arraycopy(result, 0, finalResult, 0, count);

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[][] subarraysWithSum = findSubarraysWithSum(nums, target);

        if (subarraysWithSum.length == 0) {
            System.out.println("No subarrays found with the target sum.");
        } else {
            System.out.println("Subarrays with the target sum:");
            for (int[] subarr : subarraysWithSum) {
                for (int num : subarr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

    }
}
