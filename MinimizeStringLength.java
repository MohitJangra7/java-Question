package java5thsem;
import java.util.*;

public class MinimizeStringLength {
    public static int minimizeLength(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int maxOccurrences = 0;
        for (int count : charCount.values()) {
            maxOccurrences = Math.max(maxOccurrences, count);
        }
        int minLength = str.length() - maxOccurrences;
        return minLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = minimizeLength(str);
        System.out.println("Minimum length after operation: " + result);
    }
}
