package java5thsem;
import java.util.*;
public class joseph_problem {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (josephus(n - 1, k) + k) % n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2;

        int survivor = josephus(n, k) + 1;
        System.out.println("The survivor is at position: " + survivor);
    }
}
