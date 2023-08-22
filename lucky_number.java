package java5thsem;

import java.util.ArrayList;
import java.util.Scanner;

public class lucky_number {

    static ArrayList fun(int arr[], int k){
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int n=arr.length;
        for(int i=0; i<n; i++) {
            if ((i + 1) % k == 0) {
                continue;
            }
            else{
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=1;
        int []arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=a;
            a++;
        }
//        for(int i=0; i<n;)
        System.out.println(fun(arr,k));
    }
}