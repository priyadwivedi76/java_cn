package src.recursion;

public class replaceChar {
    public static String replaced(String str,char replaced,char toReplace,int startIndex){
        String res="";
        if(str.isEmpty()){
            return res;
        }
        if(startIndex>=str.length()){
            return res;
        }
        char currentChar=str.charAt(startIndex);
        if(currentChar==toReplace) {
            currentChar = replaced;
        }
            return currentChar+replaced(str,replaced,toReplace,startIndex+1);
    }

    public static void printString(String str,char toReplace,char replaced){
        String output=replaced(str,replaced,toReplace,0);
        for(int i=0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
    }
    public static void main(String[] args) {
        printString("abcdee",'b','s');
    }
}
