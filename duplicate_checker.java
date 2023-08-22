import java.util.HashSet;
import java.util.Set;

public class duplicate_checker {
    public static boolean hasDuplicates(int[] arr) {
        // Create an empty set
        Set<Integer> seen = new HashSet<>();

        // Traverse the array elements
        for (int num : arr) {
            // Check if the element exists in the set
            if (seen.contains(num)) {
                return true;
            } else {
                // Add the element to the set
                seen.add(num);
            }
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(hasDuplicates(array1));  // false

        int[] array2 = {1, 2, 3, 4, 4};
        System.out.println(hasDuplicates(array2));  // true
    }
}
