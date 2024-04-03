package oops;

public class complexNum {
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(2,3);
        c1.print();

        c1.setReal(10);
        c1.setImaginary(30);
        c1.print();

        ComplexNumber c2=new ComplexNumber(1,5);
        c1.add(c2);
        c1.print();
        c2.print();

        ComplexNumber c3=new ComplexNumber(3,2);
        c3.multiply(c2);
        c3.print();
        c2.print();

        ComplexNumber c4=ComplexNumber.Add(c1,c3);
        c1.print();
        c3.print();
        c4.print();

        ComplexNumber c5=c1.conjugate();
        c5.print();
    }
    
}

class ComplexNumber{
    private int RealNum;
    private int ImaginaryNum;

    //constructor
    public ComplexNumber(int RealNum,int ImaginaryNum){
        this.RealNum=RealNum;
        this.ImaginaryNum=ImaginaryNum;
    }

    public void print(){
        if(ImaginaryNum>0){
            System.out.println(RealNum+"+"+ImaginaryNum+"i");
        }
        else{
            System.out.println(RealNum+""+ImaginaryNum+"i");
        }
    }

    //getter
    public int getRealNum(){
        return RealNum;
    }

    public int getImaginaryNum(){
        return ImaginaryNum;
    }

    //setter
    public void setReal(int real){
        this.RealNum=real;
    }

    public void setImaginary(int imaginary){
        this.ImaginaryNum=imaginary;
    }

    public void add(ComplexNumber c2){
        this.RealNum=this.RealNum+c2.RealNum;
        this.ImaginaryNum=this.ImaginaryNum+c2.ImaginaryNum;
    }

    public void multiply(ComplexNumber c2){
        this.RealNum=this.RealNum*c2.RealNum;
        this.ImaginaryNum=this.ImaginaryNum*c2.ImaginaryNum;
    }

    public static ComplexNumber Add(ComplexNumber c1,ComplexNumber c2){
        int newReal=c1.RealNum+c2.RealNum;
        int newImaginary=c2.ImaginaryNum+c1.ImaginaryNum;
        ComplexNumber c=new ComplexNumber(newReal, newImaginary);
        return c;
    }

    public ComplexNumber conjugate(){
        ComplexNumber c=new ComplexNumber(this.RealNum, this.ImaginaryNum*(-1));
        return c;
    }
}
