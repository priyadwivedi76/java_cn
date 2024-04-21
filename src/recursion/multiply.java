package src.recursion;

public class multiply {
    public static int muntiplication(int m,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return m;
        }
        int multiply=m+muntiplication(m,n-1);
        return multiply;
    }
    public static void main(String[] args) {
        System.out.println(muntiplication(3,6));
    }
}
