package src.sort;

public class quickSort {
    public static void quickSorted(int[] input, int startindex, int endIndex) {
        if (startindex >= endIndex) {
            return;
        }
        int pivot=partition(input,startindex,endIndex);
        quickSorted(input,startindex,pivot-1);
        quickSorted(input,pivot+1,endIndex);
    }

    public static int partition(int[] input, int  startIndex, int endIndex) {
        int pivot = input[startIndex];
        int count=0;
        //find the appropriate position for pivot such that all the smaller elements compared  to pivot lies on the  left side of pivot
        for(int i=startIndex+1;i<=endIndex;i++){
        if(input[i]<pivot){
            count++;
        }
    }
    int newPivot=startIndex+count;
    //swap pivot to new index
    input[startIndex]=input[newPivot];
    input[newPivot]=pivot;

    //collect  all the elements smaller on the left side and greater on right side
    int i=startIndex;
    int j=endIndex;
    while(i<j){
        while(i<=endIndex && input[i]<=pivot){
            i++;
        }
        while(input[j]>pivot){
            j--;
        }
        //when the i and j have stopped iterating swap them and further execute the iteration after swapping
        if(i<=j){
            int temp=input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;
            j--;
        }
    }
    return newPivot;
}

    public static void print(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array={2,3,4,5,6,1};
        quickSorted(array,0,array.length-1);
        print(array);
    }
}
