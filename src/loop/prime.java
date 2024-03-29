package loop;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=true;
        for(int i=1;i<=num;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    prime=false;
                }
            }
            if(prime==true){
                System.out.print(i);
            }
            else{
                prime=true;
            }
        }

    }
}
