public class minPartioning{
//it is variation of 0/1 Knapsack
    public static int minPartion(int arr[]){
        int sum=0;
        int n= arr.length;
        for( int i=0; i<n; i++){
            sum+=arr[i];
        }
        int w= sum/2;// we will assume
        int dp[][]= new int[n+1][w+1];// n is number of items of elements  & w= max allowed sum in the knapsack whose capacity is sum/2
        for( int i=1; i<n+1 ;i++){
            for ( int j=1; j<w+1; j++){
                //check valid or invalid 
                if(arr[i-1]<=j){// valid :- wt of the element is smaller than the maximum capacity
                    // here the val[] is alos arr[] array & wt[] array is also arr[] array
                    dp[i][j]= Math.max(arr[i-1]+ dp[i-1][j-arr[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        int sum1= dp[n][w];
        int sum2= sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String args[]){
        int arr[]= {1,6,11,5};
        System.out.println(minPartion(arr));
    }
}