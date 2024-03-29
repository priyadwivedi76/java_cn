package array;
import java.util.Scanner;
import java.util.Arrays;
public class uniqueOfDuplicate {
    //take input of array
    public static int[] inputArray() {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    // brute force to find the unique between the duplicates-approach1->o(n^2)
    public static void unique1(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("The unique value is:"+arr[i]);
            }
        }
    }

    //better time complexity algorithm using sorting-approach2->O(nlogn)
    public static void unique2(int arr[]) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                System.out.println("The unique number in array is:"+arr[i]);
                return;
            }
        }
    }

    //better time complexity algorithm using approach3 ie xor method->O(n)
    public static void unique3(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        System.out.println("The unique value in array:"+res);
    }
    public static void main(String[] args) {
        int duplicates[]=inputArray();
        // unique1(duplicates);
        // unique2(duplicates);
        unique3(duplicates);
    }
}
