package loop;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=2;
    boolean isDec=true;
    int prev=sc.nextInt();
    while(count<=n){
       int current=sc.nextInt();
       count++;
       if(current==prev){
        System.out.print("false");
        return;
       }
       if(current<prev){
        if(isDec==false){
            System.out.print("false");
            return;
        }
        }
        else{
            if(isDec==true){
            isDec=false;
        }
        }
       prev=current;
    }
    System.out.print("true");
    }
    

}
