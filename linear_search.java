package java5thsem;
import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//
//        int target = sc.nextInt();
//        boolean check = true;
//        for(int i=0;i<n;i++){
//            if(arr[i]==target){
//                System.out.println(i);
//                check = false;
//            }
//
//        }
//        if(check==true){
//            System.out.println(-1);
//        }

        int target = sc.nextInt();
        boolean check = true;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
                check = false;
            }

        }
        if(check==true){
            System.out.println(-1);
        }




    }
}
