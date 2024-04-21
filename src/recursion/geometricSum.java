package src.recursion;

public class geometricSum {
    public static float geometry(int k){
        if(k==0){
            return 1;
        }
        float lastNumber= (float) (1f/(Math.pow(2f, k)));
        return geometry(k-1)+lastNumber;
    }
    public static void main(String[] args) {
        System.out.println(geometry(4));
    }
}
