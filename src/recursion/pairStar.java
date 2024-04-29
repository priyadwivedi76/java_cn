package src.recursion;

public class pairStar {
    public static String PairStar(String str){
        if(str.length()<=1){
         return str;
        }
        String out=PairStar(str.substring(1));
        if(str.charAt(0)==str.charAt(1)){
            out=str.charAt(0)+"*"+out;
        }else{
            out=str.charAt(0)+out;
        }
        return out;
    }
    public static void main(String[] args) {
        String str="hello";
        String res=PairStar(str);
        System.out.print(res);
    }
}
