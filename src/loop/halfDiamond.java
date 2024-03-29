package loop;
import java.util.Scanner;


public class halfDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    
        for(int i=1;i<=num;i++){
            for(int space=1;space<=num-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
    
}
