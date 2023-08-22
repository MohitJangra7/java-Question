package java5thsem;

public class MissingElementFinder {
    public static int findMissingElement(int[] nums) {
        int expectedValue = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != expectedValue) {
                return expectedValue;
            }
            expectedValue++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7, 8};
        int missingElement = findMissingElement(nums);

        if (missingElement != -1) {
            System.out.println("Missing element: " + missingElement);
        } else {
            System.out.println("No missing element found.");}
    }
}