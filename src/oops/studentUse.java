package oops;
public class studentUse {
    public static void main(String[] args) {
        //without using constructor
        // StudentInfo student1 = new StudentInfo();
        // student1.name="Priya";
        // student1.setRollNo(51);
        StudentInfo student1 = new StudentInfo("Priya",51);
        StudentInfo student2 = new StudentInfo("Isha",99);
        student1.print();
        student2.print();
    }
}

class StudentInfo{
     String name;
    private int roll_no;

    //Constructor
    public StudentInfo(String n,int rn){
        name=n;
        roll_no=rn;
    }

    //access the private rollNo
    public int getRollNo(){
       return roll_no;
    }

    //change the  rollNo that is private
    public void setRollNo(int rn){
        roll_no=rn;
    }

    //printFunction
    public void print(){
        System.out.println(name+":"+roll_no);
    }
}


