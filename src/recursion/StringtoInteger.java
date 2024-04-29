package src.recursion;

public class StringtoInteger {
    public static int StringToInteger(String  str,int startIndex,int  endIndex) {
        int result=0;
        if(startIndex>=endIndex){
            return result;
        }
        int b=str.charAt(startIndex)-48;
        int a=StringToInteger(str,startIndex+1,endIndex);
        result=(int) (((b*Math.pow(10,endIndex-startIndex-1)))+a);
        return result;
    }

    //helper function
    public static int StringToInteger(String str){
        return StringToInteger(str,0,str.length());
    }
    public static void main(String[] args) {
        String str="12345";
        int res=StringToInteger(str);
        System.out.println(res);
    }
}
