package function;
import java.util.Scanner;

public class fibonacci {
    public static boolean fibon(int n){
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.print(fibon(num));
    }
}
