package loop;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int common=0;
        for(int i=1;(i<=x1)&&(i<=x2);i++){
            if((x1%i==0)&&(x2%i==0)){
                common=i;
            }
        }
        System.out.print(common);
    }
}
