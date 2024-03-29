package loop;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<=num-1;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    
}
