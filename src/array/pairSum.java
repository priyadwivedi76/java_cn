package array;
import java.util.Arrays;
import java.util.Scanner;

public class pairSum {
    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }

    //approach 1-O(n^2)
    public static int pairSum1(int array[],int key){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==key){
                    count++;
                }
            } 
        }
        return count;
    }

    //approach 2-O(nlogn);
    public static int pairSum2(int arr[],int key) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int res=0;
        while(i<j){
            if(arr[i]+arr[j]==key){
                res++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>key){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=inputArray();
        int key=sc.nextInt();
        // System.out.println(pairSum1(array, key));
        System.out.println(pairSum2(array, key));
    }
}

