package oops.fraction;

public class fractionSolve {
    public static void main(String[] args) {
        fraction f1=new fraction(20,30);
        f1.print();

        f1.setNumerator(12);
        int d=f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
        f1.setDenominator(30);
        f1.print();

        fraction f2=new fraction(3, 4);
        f1.add(f2);
        f1.print();
        f2.print();

        fraction f3=new fraction(4, 5);
        f3.multiply(f2);
        f3.print();
        f2.print();

        fraction f4=fraction.Add(f1,f3);
        f1.print();
        f3.print();
        f4.print();
    }
}

class fraction{
    private int numerator;
    private int denominator;

    public fraction(int numerator,int denominator){
        this.numerator=numerator;
        if(denominator==0){
            return;
        }
        this.denominator=denominator;
        simplify();
    }

    public void print(){
        if(denominator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    private void simplify(){
        int gcd=1;
        int small=Math.min(numerator,denominator);
        for(int i=2;i<=small;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    public void setNumerator(int n){
        this.numerator=n;
        simplify();
    }

    public void setDenominator(int d){
        this.denominator=d;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void add(fraction f2){
        this.numerator=this.numerator*f2.denominator+f2.numerator*this.denominator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public void multiply(fraction f2){
        this.numerator=this.numerator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public static fraction Add(fraction f1,fraction f2){
        int newNum1=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
        int newDeno=f1.denominator*f2.denominator;
        fraction newFraction=new fraction(newNum1,newDeno);
        return newFraction;
    }

}

