package Arrays;
//p to print sub arrays
public class arrays7 {
    public static void subarr( int num[]){
        int ts=0;
        for( int i=0; i< num.length; i++){
            int start= i;
            for( int j=i; j<num.length; j++){
                int end=j;
                for(int k= start; k<=end; k++){
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays="+ ts);
    }
    public static void main(String[] args){
        int num[]= {1,2,3,4,5,6};
        subarr(num);
    }
}
