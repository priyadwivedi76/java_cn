package string;

import java.util.Scanner;

public class charReverse {
    //print the sentence in the reverse order 
    //for eg:my name is priya is converted to priya is name my
    public static String WordwiseReverse(String str) {
        int i=0;
        String result="";
        int n=str.length();
        while(i<n){
            //to calculate the space beginning in the sentence and iterate for space found
            while((i<n)&&(str.charAt(i)==' ')){
                i++;
            }

            if(i>=n){
                break;
            }
            //the first letter after the spaces i is j and iterate till the next space is found
            int j=i+1;
                while((j<n)&&(str.charAt(j)!=' ')){
                    j++;
                }
            
            //from the space i to the j forms a word
            String word=str.substring(i,j);
                    //for output having no words inserted
                    if(result.length()==0){
                        result=word;
                    }
                    //if words are inserted then add new word before the already existing words
                    else{
                        result=word+" "+result;
                    }
            //now after each word finishes the next space is initialized     
            i=j+1;
        }
        return result;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(WordwiseReverse(str));
    }
}
