package java5thsem;

import java.util.Scanner;

public class Kth_samllest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the element to find: ");
        int k = sc.nextInt();

        System.out.print("Enter the Array: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        sorting start

        for (int i=0;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        int small = arr[k-1];
        System.out.print("the "+"th samllest element is: "+small);
    }
}
