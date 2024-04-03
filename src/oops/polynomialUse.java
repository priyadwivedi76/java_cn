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

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();

        Polynomial p3=new Polynomial.add(p1,p2);
        p3.print();
        p1.print();
        p2.print();
    }
}

class Polynomial{
    private DynamicArray coefficient;
    private int degree;

    //constructor
    public Polynomial(){
         coefficient=new DynamicArray();
    }

    //getter
    public int getCoefficient(int degree){
        if(degree<this.coefficient.length){
            return coefficient[degree];
        }
        return 0;
    }

    //setter
    public void setCoefficient(int degree,int coefficient){
        if(degree>=this.coefficient.length){
            coefficient.restructure();
        }
        coefficient[degree]=coefficient;
    }
    //add
    public Polynomial add(Polynomial p){
        Polynomial ans=new Polynomial();
        int p1=this.coefficient.length;
        int p2=p.coefficient.length;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<=len;i++){
            ans.setCoefficient(i, this.coefficient[i]+p.coefficient[i]);
        }

        while(i<p1){
            ans.setCoefficient(i, this.coefficient[i]);
        }

        while(i<p2){
            ans.setCoefficient(i, p.coefficient[i]);
        }
        return ans;
    }

    //subtract
    public Polynomial subtract(Polynomial p){
        Polynomial ans=new Polynomial();
        int p1=this.coefficient.length;
        int p2=p.coefficient.length;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i, this.coefficient[i]-p.coefficient[i]);
        }

        while(i<p1){
            ans.setCoefficient(i, this.coefficient[i]);
            i++;
        }

        while(i<p2){
            ans.setCoefficient(i, -p.coefficient[i]);
            i++;
        }
        return ans;
    }

    //multiply
    public Polynomial multiply(Polynomial p){
        Polynomial ans=new Polynomial();
        for(int i=0;i<this.coefficient.length;i++){
            for(int j=0;j<p.coefficient.length;j++){
                int termDeg=i+j;
                int termCoefficient=this.coefficient[i]*p.coefficient[j];
                int oldCoefficient=ans.getCoefficient(termDeg);
                ans.setCoefficient(termDeg,termCoefficient+oldCoefficient);
            }
        }
        return ans;
    }

    //take input of two polynomial and give the output of new plynomial
    public static Polynomial add(Polynomial p1,Polynomial p2){
        Polynomial ans=new Polynomial();
        int p1=p1.coefficient.length;
        int p2=p2.coefficient.length;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<=len;i++){
            ans.setCoefficient(i, p1.coefficient[i]+p2.coefficient[i]);
        }

        while(i<=p1){
            ans.setCoefficient(i, p1.coefficient[i]);
            i++;
        }

        while(i<=p2){
            ans.setCoefficient(i, p2.coefficient[i]);
            i++;
        }
        return ans;
    }


}
