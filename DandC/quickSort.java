package DandC;

public class quickSort {
    public static void printArr(int arr[]){
        for( int i= 0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort1(int arr[], int start, int end){

        //base case
        if(start>=end){
            return;
        }
        int pidx= partion(arr, start, end);
        quickSort1(arr,start, pidx-1);
        quickSort1(arr,pidx+1, end);
    }

    public static int partion( int arr[], int start, int end){
        int pivot=arr[end];
        int i= start-1;

        for(int j=start; j<end; j++){
            if( arr[j]<pivot){
                i++;
                //swap
                int temp= arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
        }
            //for correct positioning of pivot element
            i++;
            //swap
            int temp= pivot;
            arr[end]=arr[i];
            arr[i]=temp;
            return i;
        
    }
    public static void main(String args[]){
        int arr[]= {6,3,9,8,2,5};
        quickSort1(arr,0,arr.length-1);
        printArr(arr);
    }
}
