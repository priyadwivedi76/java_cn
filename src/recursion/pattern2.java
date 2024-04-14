package src.recursion;

public class pattern2 {
    static void pattern2(int num){
        if(num>0){
            for(int i=1;i<=num;i++){
                System.out.print("*");
            }
            System.out.println();
            pattern2(num-1);
        }
    }
    public static void main(String[] args) {
        pattern2(5);
    }
}
