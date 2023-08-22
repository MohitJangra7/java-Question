package java5thsem;

import java.util.ArrayList;
import java.util.List;

public class CommonFruitPairs {
    public static List<int[]> findPersonsWithCommonFruit(List<int[]> persons, int n) {
        List<int[]> commonPairs = new ArrayList<>();

        // Step 1: Create bitmasks for each person
        int[] personMask = new int[persons.size()];
        for (int i = 0; i < persons.size(); i++) {
            for (int fruit : persons.get(i)) {
                personMask[i] |= (1 << fruit);
            }
        }

        // Step 2: Find pairs with common fruit
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if ((personMask[i] & personMask[j]) != 0) {
                    commonPairs.add(new int[]{i, j});
                }
            }
        }

        return commonPairs;
    }

    public static void main(String[] args) {
        int n = 5; // Assuming there are 5 fruits (indexed from 0 to 4)
        int m = 4; // Assuming there are 4 persons (indexed from 0 to 3)
        List<int[]> persons = new ArrayList<>();
        persons.add(new int[]{0, 2}); // Person 0 likes fruits 0 and 2
        persons.add(new int[]{1, 3}); // Person 1 likes fruits 1 and 3
        persons.add(new int[]{0, 1}); // Person 2 likes fruits 0 and 1
        persons.add(new int[]{2, 4}); // Person 3 likes fruits 2 and 4

        List<int[]> commonPairs = findPersonsWithCommonFruit(persons, n);
        for (int[] pair : commonPairs) {
            System.out.println("Person " + pair[0] + " and Person " + pair[1] + " like at least one common fruit.");
        }
    }
}
