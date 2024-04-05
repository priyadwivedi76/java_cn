package oops;

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
        p2.print();

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();


    }
}

class Polynomial{
    private int coefficient[];
    private int degree;

    //constructor
    public Polynomial(){
         coefficient=new int[10];
    }

    //print
    public void print(){
        for(int i=0;i<coefficient.length;i++){
            if(coefficient[i]!=0){
                System.out.print(coefficient[i]+"x^"+i+"+");
            }
        }
        System.out.println();
    }

    //getter
    public int getCoefficient(int degree){
        if(degree<this.coefficient.length){
            return coefficient[degree];
        }else{
            return 0;
        }
    }

    //setter
    public void setCoefficient(int degree,int coefficient){
        if(degree>this.coefficient.length-1){
            int temp[]=this.coefficient;
            this.coefficient=new int[degree+1];
            for(int i=0;i<temp.length;i++){
            this.coefficient[i]=temp[i];
        }
        }
        this.coefficient[degree]=coefficient;
    }
    //add
    public void add(Polynomial p){
        int p1=this.coefficient.length;
        int p2=p.coefficient.length;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<len;i++){
            this.setCoefficient(i, this.coefficient[i]+p.coefficient[i]);
        }

        while(i<p1){
            this.setCoefficient(i, this.coefficient[i]);
            i++;
        }

        while(i<p2){
            this.setCoefficient(i, p.coefficient[i]);
            i++;
        }
    }

    //subtract
    public void subtract(Polynomial p){
        int p1=this.coefficient.length-1;
        int p2=p.coefficient.length-1;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<len;i++){
            this.setCoefficient(i, this.coefficient[i]-p.coefficient[i]);
        }

        while(i<p1){
            this.setCoefficient(i, this.coefficient[i]);
            i++;
        }

        while(i<p2){
            this.setCoefficient(i, -p.coefficient[i]);
            i++;
        }
    }

    //multiply
    public void multiply(Polynomial p){
        int result[]=new int[coefficient.length+p.coefficient.length-1];
        for(int i=0;i<this.coefficient.length;i++){
            for(int j=0;j<p.coefficient.length;j++){
                int termDeg=i+j;
                int termCoefficient=this.coefficient[i]*p.coefficient[j];
                result[termDeg]+=termCoefficient;
            }
        }
        this.coefficient=result;
    }
}
