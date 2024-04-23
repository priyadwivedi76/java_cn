package src.sort;

public class mergeSort {
    public static void mergedSort(int[] input, int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int mid=(startIndex+endIndex)/2;
        //first partition
        mergedSort(input,startIndex,mid);
        //second partition
        mergedSort(input,mid+1,endIndex);
        //merge both partition
        mergedSort(input,startIndex,mid,endIndex);
    }


    public static void mergedSort(int[] input, int startIndex,int midIndex, int endIndex){
        int i=startIndex;
        int j=midIndex+1;
        //new array to store the sorted elements
        int[] output=new int[endIndex-startIndex+1];
        int k=0;
        //for two partitions where one partition ends at mid and the second start from mid,compare elements from both the partition and update accordingly
        while(i<=midIndex && j<=endIndex) {
            //if element of first partition is smaller put them in output array or vice-versa.
            if (input[i] < input[j]) {
                output[k++] = input[i++];
            } else {
                output[k++] = input[j++];
            }
        }

        //copy the elements of the first partition till mid is reached
        while(i<=midIndex){
            output[k++]=input[i++];
        }
        //copy the elements of the second partitions till length of the element is received
        while(j<=endIndex){
            output[k++]=input[j++];
        }

        //copy the output array to the original array
       for(int m=0;m<output.length;m++){
           input[startIndex+m]=output[m];
       }
    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers={1,3,4,2,7,6};
        mergedSort(numbers,0,numbers.length-1);
        printArray(numbers);
    }

}
