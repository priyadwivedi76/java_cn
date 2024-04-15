package src.oops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Employee em1=new Employee();
        em1.setName("Priya");
        em1.setSalary(9000);
        System.out.println(em1.getName());
        System.out.println(em1.getSalary());

        Cellphone cell1=new Cellphone();
        cell1.printRing();
        cell1.printVibrating();

        Square sq=new Square();
        sq.side();
        sq.perimeter();
        sq.calculatingArea();

        Rectangle rect=new Rectangle();
        rect.side();
        rect.perimeter();
        rect.calculatingArea();
    }

}
class Employee{
   private int salary;
   private String name;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class Cellphone{
    public void printRing(){
        System.out.println("Cell phone is Ringing");
    }

    public void printVibrating(){
        System.out.println("Cell Phone is Vibrating");
    }
}

class Square{
    Scanner sc=new Scanner(System.in);
    int side;
    public void side(){
        System.out.println("Enter  the sides of the square");
        side=sc.nextInt();
        System.out.println(side);
    }

    public void calculatingArea(){
        int area=side*side;
        System.out.println("The area of the square is:"+area);
    }

    public void perimeter(){
        int perimeter=4*this.side;
        System.out.println("The perimeter of the square is:"+perimeter);
    }
}

class Rectangle{
    Scanner sc=new Scanner(System.in);
    int length;
    int breadth;
    public void side(){
        System.out.println("Enter  the length and breadth of the rectangle:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        System.out.println("length:"+length+" "+"Breadth:"+breadth);
    }

    public void calculatingArea(){
        int area=length*breadth;
        System.out.println("The area of the square is:"+area);
    }

    public void perimeter(){
        int perimeter=2*(length+breadth);
        System.out.println("The perimeter of the square is:"+perimeter);
    }
}
