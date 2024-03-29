package string;

import java.util.Scanner;

public class permutation {
    public static boolean permutation(char str1[],char str2[]) {
        //for two string  if the character are same in both the string then they are permutation
        //array to store all the number of characters occuring in string 
        int character[]=new int[256];
        boolean isPermutation=true;

        //if the length are diffrent they mean that they cant be in permutation
        if(str1.length!=str2.length){
            isPermutation=false;
            return isPermutation;
        }

        //for str1 keep on adding 1 in the no of character occuring but if the same character occur in the str2 then minus it by 1
        for(int i=0;i<str1.length && i<str2.length;i++){
            character[str1[i]]++;
            character[str2[i]]--;
        }

        for(int i=0;i<character.length;i++){
            //if character at the end has 0 value that means for every +1 in str1 there is -1 in str2 and thus it is permutation
            if(character[i]!=0){
                isPermutation=false;
            }
        }
        return isPermutation;
        }

        public static char[] takeInput(String str) {
            Scanner sc=new Scanner(System.in);
            //convert the string into array that stores character individually
            char array[]=str.toCharArray();
            return array;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string2=sc.nextLine();
        char str1[]=takeInput(string2);
        char str2[]=takeInput(string1);
        System.out.println(permutation(str1,str2));
    }
}
