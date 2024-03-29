package function;
import java.util.Scanner;


public class FarhenCel {
    public static void Farhen(int s,int e,int w) {
        int cel=0;
        for(int i=s;i<=e;i=i+w){
            cel=(int)((5/9.0)*(i-32));
            System.out.println(i+":"+cel);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int steps=sc.nextInt();
        Farhen(start, end, steps);
    }
    
}
