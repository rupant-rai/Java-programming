import java.util.*;
public class MCM {

    public static int mcmRec(int arr[], int i, int j){
        //Base case
        if(i==j) return 0;
        // comparison varaiable lenge
        int ans= Integer.MAX_VALUE;
        for( int k=i; k<=j-1; k++){
            int cost1= mcmRec(arr, i, k);// resultant 1= arr[i-1]x arr[k];
            int cost2= mcmRec(arr, k+1, j);// resultant 2= arr[k] x arr[j];
            // cost of multiplying res1 and res2
            int cost3= arr[i-1]*arr[k]*arr[j];

            int finalAns= cost1+cost2+cost3;

            ans= Math.min(ans, finalAns);
        }
        return ans;
    }

    public static int mcmMemo( int arr[], int i, int j, int dp[][]){
        // Base case
        if( i==j){
            return 0;
        }
        //condition to check that if min cost is calculated or not
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans= Integer.MAX_VALUE;
        // for loop to calculate the cost if not calculated
        for( int k=i; k<=j-1; k++){
            int cost1= mcmMemo(arr, i, k, dp);
            int cost2= mcmMemo(arr, k+1, j, dp);
            int cost3= arr[i-1]*arr[k]* arr[j];

            ans= Math.min(ans, cost1+cost2+cost3);
        }

        return dp[i][j]= ans;
    }


    public static int mcmTab( int arr[]){
        int n= arr.length;
        int dp[][]= new int[n][n];

        // initialization

        for ( int i=0; i<n; i++){
            dp[i][i]=0;// if i==j then cost =0;
        }

        // filling the table from bottom up approach or small to large problem
        // we will start from len 2 because for len 0 and 1 mean either single matrix multiplication or zero matrix
        // and in both the cases we have the cost =0.

        for ( int len=2;len<=n-1; len++){
            //for row
            for( int i=1; i<=n-len; i++){
                // for col
                int j= i+len-1;
                dp[i][j]= Integer.MAX_VALUE;
                //calculate the minimum cost as we have done in the memoization
                for ( int k=i; k<=j-1; k++){
                    int cost1= dp[i][k];
                    int cost2= dp[k+1][j];
                    int cost3= arr[i-1]* arr[k]* arr[j];

                    dp[i][j]= Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];

    }
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter length of the array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Array");

        for ( int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();

        //for memoization

        int dp[][]= new int[n][n];
        for ( int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        
        System.out.println(mcmRec(arr,1,n-1));
        System.out.println(mcmMemo(arr, 1, n-1, dp));
        System.out.println(mcmTab(arr));
    }

    public static void print(int dp[][]){
        for ( int i=0; i<dp.length; i++){
            for ( int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
