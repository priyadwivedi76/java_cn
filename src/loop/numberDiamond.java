package loop;
import java.util.Scanner;

public class numberDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int space=1;space<=num-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        int n1=num-1;
        for(int i=1;i<=n1;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print(j);
            } 
            for(int k=n1-i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
