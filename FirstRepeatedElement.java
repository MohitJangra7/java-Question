package java5thsem;
import java.util.HashSet;

public class FirstRepeatedElement {
    public static Integer findFirstRepeatedElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 2, 3};
        Integer firstRepeatedElement = findFirstRepeatedElement(array);

        if (firstRepeatedElement != null) {
            System.out.println("First repeated element: " + firstRepeatedElement);
        } else {
            System.out.println("No repeated element found.");
        }
    }
}
