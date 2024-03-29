package loop;
import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.print("The digit reversed to the original digits is:"+reverse);
    }
}
