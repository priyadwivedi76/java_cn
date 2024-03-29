package loop;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                sum=sum+j;
                if(j<i){
                    System.out.print("+");
                }
            }
            System.out.print("="+sum);
            System.out.println();
        }
    }
}
