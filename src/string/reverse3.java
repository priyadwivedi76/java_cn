package string;

import java.util.Scanner;

public class reverse3 {

    public static String reverseEachWord(String str) {

        //reverse each word
        //welcome to my word is converted to emoclew ot ym drow
        int i=0;
        String res="";
        int n=str.length();
        while(i<n){
            //i is the space before the start of each word and i terminates if the space ends
            while(str.charAt(i)==' ' && i<n){
                i++;
            }

            if(i>=n){
                break;
            }
        //after termination of i the count of the non spaces ie the length of each word is maintained in j
        int j=i+1;

        //iterate j until the next space is found if any space is found the j terminates
        while(j<n && str.charAt(j)!=' '){
            j++;
        }
        //break the string into substring from first space to next space ie i to j and store it in word
        String word=str.substring(i, j);
        String revWord="";
        //rev the word
        for(int k=word.length()-1;k>=0;k--){
            revWord+=word.charAt(k);
        }
        //add the rev word to the output
        res+=revWord+" ";
        //j is where the last word is found so j+1 will be space
        i=j+1;
    }
    return res;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseEachWord(str));
    }
}
