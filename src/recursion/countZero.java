package src.recursion;

public class countZero {

    public static int zero(int n){
        int count=0;
        if(n<10){
            if(n==0){
                return 1;
            }else{
                return 0;
            }
        }

        if(n%10==0){
            return zero(n/10)+1;
        }else{
            return  zero(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(zero(1080500));
    }
}
