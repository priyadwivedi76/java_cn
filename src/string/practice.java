package src.string;
import java.util.Scanner;


public class practice {
    public static void main(String[] args) {
        String str="Priya";
        //convert  the string to  lowercase
        System.out.println(str.toLowerCase());

        /* replace space with underscore */
        String st1="My Name is Priya";
        String newStr=st1.replace(" ","_");
        System.out.println(newStr);

        /*Print name by taking name from user*/
        System.out.println("Enter the name you want in string:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String letter="Dear <|name|>,Thanks a lot";
        letter=letter.replace("<|name|>",name);
        System.out.println(letter);


        //detect the spaces
        String doubleName="My name is    askshita";
        System.out.println(doubleName.indexOf("   "));

        //sequence Character
        String seqChar="Dear Harry,\n\tThis Java Course is nice.\n\tThanks";
        System.out.println(seqChar);
    }
}
