package string;
import java.util.Scanner;
public class deleteChar {
    public static String DeleteChar(String str,char delete) {
        //delete the character from string
        String res="";
        for(int i=0;i<str.length();i++){
            char newWord=str.charAt(i);
            //if the character is not the character that needs to be deleted then add the character to the output string
            if(newWord!=delete){
                res=res+newWord;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char delete=sc.next().charAt(0);
        System.out.println(DeleteChar(str, delete));
    }
}
