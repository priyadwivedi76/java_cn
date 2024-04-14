package src.recursion;
import java.util.Scanner;
public class fionacci2 {
    static  int fibonacci(int n){
        if(n==1){
//            System.out.println();
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=fibonacci(num);
        System.out.println(res);
        }
    }

