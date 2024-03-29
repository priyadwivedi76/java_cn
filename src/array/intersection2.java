
package array;
import java.util.Scanner;
import java.util.Arrays;


public class intersection2 {
    public static void main(String[] args) {
        System.out.println("The values of array1 and array2 are:");
        int array1[]=inputArray();
        int array2[]=inputArray();
        int res[]=intersection(array1, array2);
        System.out.println("The array formed after intersection of array1 and array2 is:");
        printArray(res);
    }

    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        System.out.println("The number of elements in array is:");
        int m=s.nextInt();
        int array[]=new int[m];
        System.out.println("The elements of array are:");
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }

    public static int[] intersection(int[] arr1,int[] arr2) {
        //sort both array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //new array for storing the result
        int res[]=new int[arr2.length];
        int count=0;

        //i to maintain count of elements in arr1 and j to maintain arr2
        int i=0;
        int j=0;

        //if any of arr terminates stop the comparison
        while(i<arr1.length&&j<arr2.length){
            
            if(arr1[i]!=arr2[j]){
                //if i is smaller than increment i and compare the next element with the current value of j
                if(arr1[i]<arr2[j]){
                    i++;
                }
                //else if j is smaller than increment j and compare next value of j with the current value of i 
                else{
                    j++;
                }
            }
            else if(arr1[i]==arr2[j]){
                res[count]=arr1[i];
                count++;
                i++;
                j++;
            }
        }
        return res;
    }
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}