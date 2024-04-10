package oops;

import java.net.StandardSocketOptions;

public class polynomialUse {
    public static void main(String[] args) {
        Polynomial p1=new Polynomial();
        p1.setCoefficient(0,3);
        p1.setCoefficient(2,2);
        p1.print();

        Polynomial p2=new Polynomial();
        p2.setCoefficient(0,3);
        p2.setCoefficient(2,2);
        p2.setCoefficient(1,4);
        p2.setCoefficient(2,5);

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();

        Polynomial p3=Polynomial.add(p1,p2);
        p3.print();
        p1.print();
        p2.print();
    }
}

class Polynomial {
    private int coefficient[];

    //constructor
    public Polynomial() {
        coefficient = new int[5];
    }

    public void print() {
        for (int i = 0; i < this.coefficient.length; i++) {
            System.out.print(coefficient[i]+ "x^" +i+"+");
        }
        System.out.println();
    }

    public int getCoefficient(int degree) {
        if (degree < this.coefficient.length) {
            return this.coefficient[degree];
        }
        return 0;
    }

    public void setCoefficient(int degree, int coefficient) {
        if (degree >= this.coefficient.length) {
            int[] temp = this.coefficient;
            this.coefficient = new int[degree + 1];
            for (int i = 0; i < temp.length; i++) {
                this.coefficient[i] = temp[i];
            }
        }else{
            this.coefficient[degree] = coefficient;
        }
    }

    public void add(Polynomial p) {
        int leng1 = this.coefficient.length;
        int leng2 = p.coefficient.length;
        int len = Math.min(leng1, leng2);
        for (int i = 0; i < len; i++) {
            this.setCoefficient(i, this.coefficient[i] + p.coefficient[i]);
        }
        if (leng1 > len) {
            for (int i = len; i < leng1; i++) {
                this.setCoefficient(i, this.coefficient[i]);
            }
        }
        if (leng2 > len) {
            for (int i = len; i < leng2; i++) {
                this.setCoefficient(i, p.coefficient[i]);
            }
        }
    }

    public void multiply(Polynomial p) {
        {
            int res[] = new int[this.coefficient.length + p.coefficient.length - 1];
            for (int i = 0; i < this.coefficient.length-1; i++) {
                for (int j = 0; j< p.coefficient.length-1; j++) {
                    int termDeg = i + j;
                    int newCoefficient = this.coefficient[i] * p.coefficient[j];
                    res[termDeg] += newCoefficient;
                }
            }
            this.coefficient = res;
        }
    }

    public static Polynomial add(Polynomial p1, Polynomial p2) {
        Polynomial res = new Polynomial();
        int leng1 = p1.coefficient.length;
        int leng2 = p2.coefficient.length;
        int len = Math.min(leng1, leng2);
        for (int i = 0; i < len; i++) {
            res.setCoefficient(i, p1.coefficient[i] + p2.coefficient[i]);
        }
        if (leng1 > len) {
            for (int i = len; i < leng1; i++) {
                res.setCoefficient(i, p1.coefficient[i]);
            }
        }
        if (leng2 > len) {
            for (int i = len; i < leng2; i++) {
                res.setCoefficient(i, p2.coefficient[i]);
            }
        }
        return res;
    }
}

