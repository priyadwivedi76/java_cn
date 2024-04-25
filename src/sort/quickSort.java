package src.sort;

public class quickSort {
    public static void quickSorted(int[] input,int startindex, int endIndex){
        if(startindex>=endIndex){
            return;
        }
    }
    public static int partition(int[] input,int startIndex,int endIndex){
        //assign first element
        int pivot=startIndex;

        //find the suitable place for pivot
        int count=0;
        for(int i=startIndex;i<endIndex;i++){
            if(input[pivot]>=input[i]){
                count++;
            }
        }
        //replace pivot at appropriate position-swap
        int newPivot=startIndex+count;
        int temp=input[pivot];
        input[pivot]=input[newPivot];
        input[newPivot]=temp;

        int i=startIndex;
        int j=endIndex;
        while( i>=startIndex && j<=endIndex){
            if(input[startIndex]<=input[newPivot]){
                i++;
            }
            if(input[endIndex]>=input[newPivot]){
                j--;
            }
            if()
        }
}
