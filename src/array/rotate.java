package array;
import java.util.Scanner;

public class rotate {

    //approach 1
    public static int[] rotate(int arr[],int rotate) {
        while(rotate!=0){
            int temp=0;
            temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
            rotate--;
        }
        return arr;
    }

    //approach 2
    public static void rotate2(int arr[],int rotate) {
        int ElementStore[]=new int[rotate];
        for(int i=0;i<ElementStore.length;i++){
            ElementStore[i]=arr[i];
        }
        int j=0;
        while(j!=arr.length){
            for(int i=rotate;i<arr.length;i++){
                arr[j]=arr[j+rotate];
                j++;
            }
            for(int k=0;k<ElementStore.length;k++){
                arr[j]=ElementStore[k];
                j++;
            }
        }
    }

    public static void reverse(int array[]) {
       int i=0;
       int j=array.length-1;
       int temp=0;
       while(i!=j){
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        i++;
        j--;
       }
    }
    
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //approach 3
    public static void swap(int arr[],int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void reverse(int arr[],int start,int end) {
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void rotate3(int array[],int rotate){
        if(array.length==0){
            return;
        }else{
            reverse(array,0,array.length-1);
            reverse(array,0,array.length-rotate-1);
            reverse(array,array.length-rotate,array.length-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input array:");
        int arr[]=inputArray();
        System.out.println("Enter the number of times rotation of the array must be executed:");
        int rotate=sc.nextInt();
        rotate3(arr, rotate);
        printArray(arr);
    }
    
}
