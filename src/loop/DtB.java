package loop;
import java.util.Scanner;

public class DtB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prev=1;
        int ans=0;
        while(num!=0){
            int remainder=num%2;
            ans=ans+remainder*prev;
            num=num/2;
            prev=prev*10;
        }
        System.out.print(ans);
    }
}
