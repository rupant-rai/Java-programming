package Arrays;
//p to print rotating array
public class arrays10 {
    public static void rev( int num[], int start, int end){
        start=0;
        end=num.length-1;
        while(start<end){
            int temp= num[start];
            num[start]= num[end];
            num[end]= temp;
            start++;
            end--;
        }
    }
    public static void main( String[] args){
        int num[]={1,2,3,4};
        int k=1;
        rev(num,0,k-1);
        rev(num,k,num.length-1);
        rev(num,0, k-1);
        for(int i=0; i<num.length; i++){
        System.out.print(num[i]+ " ");
        }
    }
}
