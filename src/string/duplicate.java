package string;

import java.util.Scanner;
public class duplicate {
    public static String RemoveDuplicate(String str){
        String res="";
        //remove the duplicate character and print single charater
        for(int i=0;i<str.length();i++){
            //print first character
            if(i==0){
                res=res+str.charAt(i);
            }
            else{
                //check the last inserted character with the new character at the iteration if they are equal or duplicate then dont add else add to output strin
                char newChar=str.charAt(i);
                char lastChar=res.charAt(res.length()-1);
                if(newChar!=lastChar){
                    res=res+newChar;
                }else{
                    continue;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(RemoveDuplicate(str));
    }
}
