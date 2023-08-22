package java5thsem;
import java.util.*;
public class binary_to_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        int decimalValue = Integer.parseInt(binaryString, 2);

        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);
    }
}
