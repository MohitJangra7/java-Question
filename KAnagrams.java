package java5thsem;
import java.util.*;


public class KAnagrams {
    public static boolean areKAnagrams(String str1, String str2, int k) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int count = 0;

        for (char c : str2.toCharArray()) {
            if (charCount.containsKey(c) && charCount.get(c) > 0) {
                charCount.put(c, charCount.get(c) - 1);
            } else {
                count++;
            }
        }

        return count <= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int k = sc.nextInt();

        if (areKAnagrams(str1, str2, k)) {
            System.out.println("Yes, the strings are K-anagrams.");
        } else {
            System.out.println("No, the strings are not K-anagrams.");
        }
    }
}
