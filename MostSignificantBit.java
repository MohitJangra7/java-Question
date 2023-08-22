package java5thsem;
import java.util.*;
public class MostSignificantBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int msbPosition = -1;

        while (num > 0) {
            num >>= 1;
            msbPosition++;
        }

        System.out.println("Most significant bit position: " + msbPosition);
    }
}
