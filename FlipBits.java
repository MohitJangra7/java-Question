package java5thsem;
import java.util.*;
public class FlipBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int flippedNum = ~num;

        System.out.println("Original number: " + num);
        System.out.println("Flipped number: " + flippedNum);
    }
}
