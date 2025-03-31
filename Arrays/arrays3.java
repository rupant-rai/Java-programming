package Arrays;
//largest in arrays
public class arrays3 {
   public static int largest( int num[]){
     int lar= Integer.MIN_VALUE;//FOR MINUS INFINITY
     int small= Integer.MAX_VALUE;//for plus infinity
    for(int i=0; i<num.length; i++){
        if( lar<num[i]){
            lar=num[i];
        }
        if( small>num[i]){
            small=num[i];
        }
    }
    System.out.println("smallest number is  "+ small );
    return lar;
   } 
   public static void main(String[] args){
    int number[]={1,2,4,5,6,9};
    System.out.println("largest number in the given array = "+largest(number));
   }
}
