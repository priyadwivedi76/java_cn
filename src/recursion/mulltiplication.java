package src.recursion;

public class mulltiplication {
    //recursive method
    static int multiply(int n, int i) {
        if (i <= 10) {
            System.out.println(n + "*" + i + "=" + n * i);
            return multiply(n, i + 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        multiply(6, 1);
    }

}
