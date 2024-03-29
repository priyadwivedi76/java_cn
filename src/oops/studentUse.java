package oops;
public class studentUse {
    public static void main(String[] args) {
        // Creating new Student objects
        Student student1 = new Student();
        student1.name="Priya";
        Student student2=new Student();
        student2.name="Sachin";
        System.out.println(student1.name);
    }
}
class Student {
    String name;
    int age;
}
