package src.recursion;

public class replacePI {
    public static String replacingPi(String str,int startIndex,int endIndex){

        String newChar="3.14";
        if(startIndex>=endIndex){
            return str;
        }
        if(str.substring(startIndex,startIndex+2).equals("pi")){
            str=str.substring(0,startIndex)+"3.14"+str.substring(startIndex+2);
            return replacingPi(str,startIndex+4,endIndex+2);
        }else{
            return replacingPi(str,startIndex+1,endIndex);
        }
    }

    //helper function
    public static String replacingPi(String str) {
        return replacingPi(str,0,str.length()-1);
    }

    public static void main(String[] args) {
        String str="pixpi";
        String  res=replacingPi(str);
        System.out.println(res);
    }
}
