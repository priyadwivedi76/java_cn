package loop;
import java.util.Scanner;


public class parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
