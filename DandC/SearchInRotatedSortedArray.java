package DandC;

public class SearchInRotatedSortedArray {
    public static void main(String args[]){
        int arr[]= {4,5,6,7,0,1,2};
        int target=0;
        int idx= search(arr, target, 0, arr.length-1);
        System.out.println(idx);

    }
    public static int search(int arr[], int tar, int start, int end){
        int mid= start+(end-start)/2;
        // case 1: when target is on the mid
        if( arr[mid]== tar){
            return mid;
        }

        // case 2: when mid is on line 1
        if(arr[start]<=arr[mid]){
            //case A: left of l1
            if( arr[start]<=tar && tar<=arr[mid]){
                return search(arr, tar, start, mid-1);
            }
            //case B: right of l2
            else{
                return search(arr, tar, mid+1, end);
            }
        }

        // case 3: when mid is on the line 2
        else{
            //case A: when tar is in right of l2
            if(arr[mid]<= tar && tar<= arr[end]){
                return search(arr, tar, mid+1, end);
            }
            //case B: when tar is in left of l2
            else{
                return search(arr, tar, start, mid-1);
            }
        }
    } 
}
