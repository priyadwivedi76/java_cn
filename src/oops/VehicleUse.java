package oops;

public class VehicleUse {
    public static void main(String[] args) {
        Car c=new Car(10,100);
        c.numGears=25;
        c.setMaxSpeed(10);
        c.isConvertible=true;
        c.colour="Black";
        c.printCar();
    }
    
}

class Vehicle{
     String colour;
     private int maxSpeed;

    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
    }

    public void print(){
        System.out.println("Colour:"+colour);
        System.out.println("Max_speed:"+getMaxSpeed());
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
}

class Car extends Vehicle{
    int numGears;
    boolean isConvertible;
    //Car Constructor
    public Car(int numGears,int maxSpeed){
        super(maxSpeed);
        this.numGears=numGears;
        System.out.println("Car Constructor");
    }

    public void printCar(){
        //use of super keyword to call the inherited class and its function called print
        super.print();
        System.out.println("numGears:"+numGears);
        System.out.println("isConvertible:"+isConvertible);
    }
}
