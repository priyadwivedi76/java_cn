package src.recursion;

public class checkNum {

    public static boolean checkNum(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        if(arr.length==0){
            return false;
        }
        if(arr.length<=1){
            return key==arr[0];
        }
        int mid=(low+high)/2;
        if(arr[mid]==key){
            return true;
        }
        int[] leftArray=new int[mid];
        for(int i=0;i<mid;i++){
            leftArray[i]=arr[i];
        }
        boolean ans1=checkNum(leftArray,key);
        int[] rightArray=new int[arr.length-mid-1];
        for(int i=0,j=mid;i<rightArray.length && j<arr.length;i++,j++){
            rightArray[i]=arr[j];
        }
        boolean ans2=checkNum(rightArray,key);
       if(ans1==true||ans2==true){
           return true;
       }else{
           return false;
       }
    }
    public static void main(String[] args) {
        int arr[]={5,10,12,30};
        int key=2;
        System.out.println(checkNum(arr,key));
    }
}
