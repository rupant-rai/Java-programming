package Arrays;

public class arrays8 {
    // public static void maxsubarr(int num[]){
        // int cursum=0;
        // int maxsum=Integer.MIN_VALUE;
        // for(int i=0; i< num.length; i++){
        //     for( int j=i; j<num.length; j++){
        //         cursum= 0;
        //         for( int k=i; k<=j; k++){
        //             cursum+=num[k];
        //         }
        //         System.out.print(cursum+ " ");
        //         if(maxsum<cursum){
        //             maxsum= cursum;
        //         }
        //     }
        // }
        // System.out.println("max sum among subarrays="+ maxsum);



        //another approach for the same question
        
    //     int cursum=0;
    //     int maxsum=Integer.MIN_VALUE;
    //     int prefix[]= new int[num.length];
    //     prefix[0]= num[0];
    //     for(int i=1; i<num.length; i++){
    //         prefix[i]=prefix[i-1]+num[i];
    //     }
    //     for( int i=0; i<num.length; i++){
    //         int start=i;
    //         for(int j=i; j<num.length; j++){
    //             int end=j;
    //             cursum= start==0 ? prefix[end]: prefix[end]-prefix[start-1];
    //             if(maxsum<cursum){
    //                 maxsum=cursum;
    //             }
    //         }
    //     }
    //     System.out.println("maximum sum ="+ maxsum);

    // }
    // public static void main( String[] args){
    //     int num[]= {1,2,3};
    //     maxsubarr(num);
    // }




    //another approach kadaens theroem



    
    public static void kadanes(int num[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for( int i=0; i<num.length; i++){
            cs= cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(" maximum sum of the subarray= "+ms);
    }
    public static void main(String[] args){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}
