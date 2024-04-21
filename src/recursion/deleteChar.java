package src.recursion;

public class deleteChar {
    public static String delete(String chars,int startIndex,char deleted){
        String ans="";
        if(startIndex>=chars.length()){
            return ans;
        }
        if(chars.charAt(startIndex)!=deleted){
            return chars.charAt(startIndex)+delete(chars,startIndex+1,deleted);
        }else {
            return delete(chars,startIndex+1,deleted);
        }
    }

    public static void printString(String chars,char delete){
        String output=delete(chars,0,delete);
        for(int i=0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
    }
    public static void main(String[] args) {
        String input="abbcdefg";
        printString(input,'b');
    }
}
