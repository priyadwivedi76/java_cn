package oops.student;
public class studentUse {
    public static void main(String[] args) {
        //without using constructor
        // StudentInfo student1 = new StudentInfo();
        // student1.name="Priya";
        // student1.setRollNo(51);
        StudentInfo student1 = new StudentInfo("Priya",51);
        StudentInfo student2 = new StudentInfo("Isha",99);
        StudentInfo student3= new StudentInfo("Riya",102);

        student1.print();
        student2.print();
        student3.print();
        System.out.println("The number of objects created:"+StudentInfo.getNumCount());
    }
}

class StudentInfo{
     String name;
    private final int roll_no;

    //static-shared by every object
    private static int numCount;

    //Constructor using this
    public StudentInfo(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        numCount++;
    }

    //getter for numCount
    public static int getNumCount(){
        return numCount;
    }

    //printFunction
    public void print(){
        System.out.println(name+":"+roll_no);
    }
}


