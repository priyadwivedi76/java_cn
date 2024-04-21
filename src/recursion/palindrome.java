package src.recursion;

public class palindrome {
    public static boolean palindrome1(String str,int startIndex,int endIndex){
        //base
        if(str.isEmpty()){
            return false;
        }
        if(startIndex>endIndex){
            return false;
        }
        //small process
        if(str.charAt(startIndex)==str.charAt(endIndex)){
            return true;
        }
        //recursion
        return palindrome1(str,startIndex+1,endIndex-1);
    }
    public static boolean palindrome1(String str){
        return  palindrome1(str,0,str.length()-1);
    }
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(palindrome1(str));
    }
}
