package string;

import java.util.Scanner;

public class highestOccur {

    public static void highestOccur(String str) {
        //higest occurence character in string
        //for all the character in java=256 
        int count[]=new int[256];
        //count of the character occuring is stored
        int maxFreq=0;

        //calculate the freq of every character and store them 
        for(int i=0;i<str.length();i++){
                //int array to store the count of character 
                //for eg:count[a]++=>count[122(ascii value of a)]++=>0+1=>1 at a
            count[str.charAt(i)]++;
            //compare freq or number of times the character has occured and compare with maxfreq then the highest freq is stored in max
            if(maxFreq<count[str.charAt(i)]){
                maxFreq=count[str.charAt(i)];
            }
        }

        //now transverse the string the first character in the string that matches with the maxfreq is returned
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==maxFreq){
                System.out.print(str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        highestOccur(str);
    }
    
}
