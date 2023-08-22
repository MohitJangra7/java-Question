package java5thsem;
import java.util.*;

public class stringchanger {
    public static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryInput = sc.nextLine();
        int binaryNumber = Integer.parseInt(binaryInput, 2);
        int numberOfOnes = countOnes(binaryNumber);
        System.out.println("Number of ones: " + numberOfOnes);
    }
}

