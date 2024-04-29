package src.recursion;

public class replaceX {
    public static String replacingX(String str,int startIndex,int endIndex) {
        String  result="";
        //base case
        if(startIndex>=endIndex){
            return result;
        }
        if (str.charAt(startIndex) != 'x') {
            result = result + str.charAt(startIndex);
        }else{
            result=result+"";
        }
        return result+replacingX(str,startIndex+1,endIndex);
    }
    //helper function
    public static String replacingX(String str) {
        return replacingX(str,0,str.length());
    }
    public static void main(String[] args) {
        String str="xaaxb";
        String res=replacingX(str);
        System.out.print(res);
    }
}
