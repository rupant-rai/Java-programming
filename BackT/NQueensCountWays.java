

public class NQueensCountWays {
    static int count =0;
    public static int countWays(char board[][], int row){
        // Base Case
        if(row==board.length){
            count++;
        }

        // main kam kya karna hai

        for( int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='q';
                countWays(board,row+1);// traversal to the next row by using recursion
                board[row][j]='x';// backtracking step
            }
        }
        return count;
    }

    public static boolean isSafe( char board[][], int row, int col){
        //vertically up 
        for( int i=row-1; i>=0; i--){
            if( board[i][col]=='q'){
                return false;
            }
        }
        // vertically up left
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if( board[i][j]=='q'){
                return false;
            }
        }
        // vertically up right
        for( int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if( board[i][j]=='q'){
                return false;
            }
        }
        return true;
    }

    public static void main( String args[]){
        char board[][]= new char[5][5];
        System.out.println(countWays(board,0));
    }
}
