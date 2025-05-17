
//bubble sort
public class sort1 {
    public static void Bublesort( int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swap=false;
            for( int j=0; j<arr.length-1-i; j++){
                if( arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                swap=true;

            }
        }
        if(!swap){
            break;
        }
    }
}
    //to print array on the display 

    public static void printarr(int arr[]){
        for( int i= 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    //Selection sort

    public static void slcsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){//for descecding order sorting  use less than symbol(<)
                    smallest=j;
                }
            }
            //swap
            int temp= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
    }



// Insertion  sort

    public static void insSort( int arr[]){
        for( int i=1; i<arr.length; i++){
            int cur=arr[i];
            int prev=i-1;
            //finding pout correct position to insert
            while(prev>=0&&arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=cur;

        }
    }


    //Counting sort

    public static void CountSort(int arr[]){
        //range or largest element 
        int larg= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            larg= Math.max(larg,arr[i]);
        }

        //count array
        int count[]= new int[larg+1];
        for( int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sort
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    //main function
    
    public static void main(String[] args){
        int arr[]= {1,2,5,4,3};
        //Bublesort(arr);
        //slcsort(arr);
        insSort(arr);
       // CountSort(arr);
        printarr(arr);
    }
}
