package src.function;

public class multipliaction {
    static void multiply(int n) {
        //iterative method
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    public static void main(String[] args) {
        int n=5;
        multiply(n);
    }
}
