package Arrays;
//binary search

public class arrays4 {
    public static void main(String[] args){
        int numbers[]={2,3,4,5,6,10,15,10};
        int key =7;
        System.out.println("index for key is "+ binSer(numbers, key));

        
    }

    //function
    public static int binSer(int numbers[] , int key){
        int start=0, end=numbers.length-1; 
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return start;
    }
}
