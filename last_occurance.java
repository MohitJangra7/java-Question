package java5thsem;
import java.util.*;

public class last_occurance {
    public static int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    lastOccurrence = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        int target = sc.nextInt();
        int lastOccurrence = findLastOccurrence(nums, target);

        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of " + target + " is at index " + lastOccurrence);
        } else {
            System.out.println(-1);
        }
    }
}
