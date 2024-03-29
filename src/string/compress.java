package string;
import java.util.Scanner;

public class compress {
    public static String compressString(String str){
        String res=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            //count the number of same characters
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                //if character are not same the add the count to output string and reset count to 1 to calculate the number of next character
                if(count>1){
                    res+=count;
                    count=1;
                }
                //add character to the  output string
                res+=str.charAt(i);
            }
        }
        //for the last digit,as it is last character and does not have charater to compare
        if(count>1){
            res+=count;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(compressString(str));
    }
}
