public class HeapSortCode{
    public static void HeapSort(int arr[]){
        int n= arr.length;
        // Build Max heap(asc order) or min Heap(desc order)
        for(int i= n/2; i>=0; i--){// only for the last uppper levels
            heapify(arr, i, n );
        }
        // swap largest element with the last element
        for( int i= n-1; i>=0; i--){
            int temp= arr[0];
            arr[0]= arr[i];
            arr[i]= temp;

            heapify(arr, 0, i);
        }
    }

    public static void heapify(int arr[], int i, int size){
        int left= 2*i+1;
        int right= 2*i+2;
        int maxIdx= i;

        if( left< arr.length && arr[left]> arr[maxIdx]){
            maxIdx= left;
        }

        if( right< arr.length && arr[right]> arr[maxIdx]){
            maxIdx= right;
        }

        if( maxIdx!= i){
            // swap
            int temp= arr[i];
            arr[i]= arr[maxIdx];
            arr[maxIdx]= temp;
            // fixing the heap

            heapify(arr,maxIdx, size);
        }
    }

    public static void main(String args[]){
        int arr[]= {1, 2, 4, 5, 3};
        HeapSort(arr);
        for ( int i= 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}