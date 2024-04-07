package oops;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.colour="White";
        v.setMaxSpeed(100);
        v.print();

        Car c=new Car();
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

    public void printCar(){

        //use of super keyword to call the inherited class and its function called print
        super.print();
        System.out.println("numGears:"+numGears);
        System.out.println("isConvertible:"+isConvertible);
    }
}
