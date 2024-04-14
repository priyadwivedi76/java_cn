package src.recursion;

public class fibonacci {
    static int a=0;
    static int b=1;
    static int c;
    static int fibo(int n){
        if(n>0){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            return fibo(n-1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.print(a+" "+b);
        fibo(7-2);
    }
}
