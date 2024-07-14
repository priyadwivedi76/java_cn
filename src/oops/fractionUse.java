package src.oops;

public class fractionUse {
    public static void temp(){
        Fraction f1=new Fraction(20,30);
        f1.print();

        f1.setNumerator(12);
        int d=f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
        try{
            f1.setDenominator(0);
        }catch(ZeroDenominatorException e){
            System.out.println("Hey do not input denominator as 0");
        }
        f1.print();

        Fraction f2=new Fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3=new Fraction(4,5);
        f3.multiply(f2);
        f3.print();
        f2.print();

        Fraction f4=Fraction.add(f1,f3);
        f1.print();
        f3.print();
        f4.print();
    }
    public static void main(String[] args)  throws ZeroDenominatorException {
        temp();
    }
}



class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify(){
        int gcd = 1;
        int small=Math.min(numerator,denominator);
        for(int i=2;i<=small;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        this.numerator=numerator/gcd;
        this.denominator=denominator/gcd;
    }

    public void print(){
        if(denominator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    public int getNumerator(){
        return numerator;
    }
     public void setNumerator(int numerator){
        this.numerator=numerator;
        simplify();
     }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int denominator) throws ZeroDenominatorException {
        if(denominator==0){
            ZeroDenominatorException e=new ZeroDenominatorException();
            throw e;
        }
        this.denominator = denominator;
        simplify();
    }
    public void add(Fraction f){
        this.numerator=this.numerator*f.denominator+f.numerator*this.denominator;
        this.denominator=this.denominator*f.denominator;
        simplify();
    }
    public void multiply(Fraction f){
        this.numerator=this.numerator*f.numerator;
        this.denominator=this.denominator*f.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNumerator=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
        int newDenominator=f1.denominator*f2.denominator;
        Fraction newFraction=new Fraction(newNumerator,newDenominator);
        return newFraction;
    }
}

class ZeroDenominatorException extends Exception{

}
