package loop;
import java.util.Scanner;

public class bTD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prev=1;
        int remainder,decimal=0;
        while(num!=0){
            remainder=num%10;
            decimal=decimal+remainder*prev;
            prev=prev*2;
            num=num/10;
        }
        System.out.print(decimal);
    }
}
