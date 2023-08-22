package java5thsem;

public class FindOddOccurrence {
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 3, 1, 3};
        int output = findOddOccurrence(inputArray);
        System.out.println("The number that occurs an odd number of times is: " + output);
    }
}
