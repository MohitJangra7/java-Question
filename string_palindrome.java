package java5thsem;
import java.util.*;
public class string_palindrome {
            public static boolean isPalindrome(String s) {
                if (s.length() <= 1) {
                    return true;
                }
                if (s.charAt(0) != s.charAt(s.length() - 1)) {
                    return false;
                }
                return isPalindrome(s.substring(1, s.length() - 1));
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String string1 = sc.nextLine();

                System.out.println(isPalindrome(string1));
            }
        }