
public class NQueensPrintSolution {
    public static boolean nQueens(char board[][], int row){
        // Base case
        if(row==board.length){
            return true;
        }

        // main kam
        for(int  j=0; j<board.length; j++){
            if( isSafe(board, row, j)){
                board[row][j]= 'q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }

    public static void PrintArr(char board[][]){
        for( int i=0; i<board.length; i++){
            for ( int j=0;j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int row,int col){
        // vertically up
        for( int i=row-1; i>=0; i--){
            if( board[i][col]=='q'){
                return false;
            }
        }

        // vertically up left
        for( int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if( board[i][j]=='q'){
                return false;
            }
        }

        // vertically up right
        for ( int i= row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if ( board [i][j]=='q'){
                return false;
            }
        }
        return true;
    }

    public static void main( String args[]){
        char board[][]= new char [4][4];
        if( nQueens(board, 0)){
            System.out.println("solution do exixt");
            PrintArr(board);
        }
        else{
            System.out.println(" solution does not exixst");
        }

    }
}
