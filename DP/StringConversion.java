public class StringConversion {
    public static int StringConv(String s1, String s2){
        int n= s1.length();
        int m= s2.length();

        int diff1= n-lcs(s1, s2);
        int diff2= m-lcs(s1,s2);

        return diff1+diff2;
    }

    public static int lcs(String s1, String s2){
        int n= s1.length();
        int m= s2.length();
        //make table

        int dp[][]= new int[n+1][m+1];

        // Initilization

        for ( int i=0; i<n+1; i++){
            for ( int j=0; j<m+1; j++){
                dp[i][j]=0;
            }
        }

        //table filling from botttom up approach or smallest to largest
        
        for ( int i=1; i<n+1; i++){
            for ( int j=1; j<m+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    //common
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    //not common
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main( String args[]){
        String s1= "pear";
        String s2="sea";
        System.out.println(StringConv(s1, s2));
    }
}
