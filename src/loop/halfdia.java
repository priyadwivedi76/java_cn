package loop;
import java.util.Scanner;

public class halfdia {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            int n1=number+1;
            System.out.println("*");
            for(int i=1;i<=n1-1;i++){
                for(int j=1;j<=n1;j++){
                    if(j==1){
                        System.out.print("*");
                    }
                }
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
                for(int s=i-1;s>=1;s--){
                    System.out.print(s);
                }
                for(int j=1;j<=2*n1-1;j++){
                    if((j==2*i-1)&&(j>1)){
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for(int i=1;i<=number-1;i++){
            for(int j=1;j<=number;j++){
                if(j==1){
                    System.out.print("*");
                }
            }
            for(int k=1;k<=number-i;k++){
                System.out.print(k);
            }
            for(int s=number-i-1;s>=1;s--){
                System.out.print(s);
            }
            System.out.print("*");
            System.out.println();
            }
            System.out.println("*");
        }
    }

    
