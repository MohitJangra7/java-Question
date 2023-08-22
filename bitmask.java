package java5thsem;
import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

public class bitmask {


        static int convert(int n){
            int even= n&(0XAAAAAAAA);
            int odd=  n&(0X55555555);
            int r1=even>>1;
            int r2=odd<<1;
            int ans=r1|r2;
            return ans;
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n =sc.nextInt();
            int ans =convert(n);
            System.out.println(ans);
            System.out.println(Integer.toBinaryString(ans));
            }
        }


