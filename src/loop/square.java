package loop;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int sq=i*i;
            if(sq==num){
                System.out.print(i);
                break;
            }else if(sq>num){
                System.out.print(i-1);
                break;
            }
        }
    }
}
