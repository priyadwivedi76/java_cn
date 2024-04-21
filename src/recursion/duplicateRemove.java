package src.recursion;

public class duplicateRemove {
    public static String duplicate(String chars,int startIndex){
        String res="";
        if(chars.isEmpty()||startIndex>=chars.length()){
            return res;
        }

        char currentChar=chars.charAt(startIndex);
        res=res+currentChar;
        int nextIndex=startIndex+1;
        while(nextIndex<chars.length()&&chars.charAt(nextIndex)==currentChar){
            nextIndex++;
        }
        return res+duplicate(chars,nextIndex);
    }

    public static void printString(String chars){
        String output=duplicate(chars,0);
        for(int i=0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
    }
    public static void main(String[] args) {
        printString("abbbcccdddee");
    }
}
