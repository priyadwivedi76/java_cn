package src.function;

import java.sql.SQLOutput;

public class average {
    static int avrg(int ...arr){
        int avrg=1;
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
        }
        System.out.println(sum);
        avrg=sum/count;
        return avrg;
    }
    public static void main(String[] args) {
        System.out.println("The average of 3 students having number 65 72 and 80 are:"+avrg(65,72,80));
    }
}
