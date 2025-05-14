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
    }
}
