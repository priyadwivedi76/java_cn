package loop;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                if(i==j){
                    System.out.print(i);
                }
            }
            for(int space=1;space<=2*(num-i)-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                if((i+j)==4){
                    System.out.print(i);
                }
            }
            System.out.println();   
        }
        int n1=num-1;
        for(int i=1;i<=n1;i++){
            for(int space=1;space<=n1-i;space++){
                System.out.print(" ");
            }
            for(int j=n1;j>=1;j--){
                if((i+j)==4){
                    System.out.print(num-i);
                }
            }
            for(int space=1;space<=(2*i)-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n1;j++){
                if(i==j){
                    System.out.print(num-i);
                }
            }
            System.out.println();
        }
    }
}
