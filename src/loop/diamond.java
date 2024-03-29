package loop;


import java.util.Scanner;
public class diamond {
    public static void main(String args[]){
        //diamond pattern
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n1=(num+1)/2;
        int n2=n1-1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1-i;j++){
                System.out.print(" ");
                }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=1;i<=n2;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*(n1-i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
    }
}
