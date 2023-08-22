package java5thsem;
import java.util.*;

public class NumberOfSwap_bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the Unsorted Array: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int swap = 0;
//        sorting start
        for (int i=0;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Number of swaps performed are "+swap);
    }
}
