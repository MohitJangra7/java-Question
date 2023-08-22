package java5thsem;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {
    public static int findMaxFrequencyElement(int[] arr) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array elements
        for (int num : arr) {
            // Increment the count for the current element
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with maximum frequency
        int maxFrequency = 0;
        int maxFrequencyElement = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyElement = entry.getKey();
            }
        }

        return maxFrequencyElement;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 4, 4, 5, 5, 5, 5};
        int maxFrequencyElement = findMaxFrequencyElement(array);
        System.out.println("Element with maximum frequency: " + maxFrequencyElement);
    }
}
