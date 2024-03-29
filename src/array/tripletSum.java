package array;
import java.util.Arrays;
import java.util.Scanner;

public class tripletSum {
    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }

    //O(n^2)
    public static int triplet1(int array[],int key) {
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k=j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==key){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //O(nlogn)
    public static int triplet2(int arr[],int key) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currentSum=arr[i]+arr[left]+arr[right];
            if(currentSum==key){
                count++;
                left++;
                right--;
            }else if(currentSum>key){
                right--;
            }else{
                left++;
            }
            }  
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=inputArray();
        int key=sc.nextInt();
        // System.out.print(triplet1(array, key));
        System.out.println(triplet2(array, key));
    }
}
