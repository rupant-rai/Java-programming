public class Sudoku {
    public static boolean sudSol(int sud [][], int row, int col){
        // Base case
        if( row==9 ){
            return true;
        }

        //setting of next row and column

        int nextrow= row;
        int nextcol= col+1;
         if( col+1==9){
            nextrow= row+1;
            nextcol=0;
         }
        
        // checking if place is occupied or not

        if(sud[row][col]!=0){
            return sudSol( sud, nextrow, nextcol);
        }

        //digit bharenge

        for( int digit=1; digit<=9; digit++){
            if(isSafe(sud, row, col, digit)){
                sud[row][col]=digit;
                // checking for next block
                if(sudSol(sud, nextrow, nextcol)){
                    return true;
                }
                sud[row][col]=0;
            }
        }
        return false;
        
    }

    public static boolean isSafe( int sud[][], int row, int col, int digit){
        //  check row
        for( int i=0; i<=8; i++){
            if(sud[i][col]==digit){
                return false;
            }
        }

        //  check in col
        for ( int i=0; i<=8; i++){
            if( sud[row][i]==digit){
                return false;
            }
        }

        //  check in grid
        int sr= (row/3)*3;
        int sc=( col/3)*3;
        
        for(int i=sr; i<sr+3; i++ ){
            for( int j=sc; j<sc+3; j++){
                if(sud[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSud( int sud[][]){
        for ( int i=0; i<9; i++){
            for( int j=0; j<9; j++){
                System.out.print(sud[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main( String args[]){
        int sud[][]={
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3},
        };
        if( sudSol(sud,0,0)){
            System.out.println("solution exist");
            printSud(sud);
        }
        else{
            System.out.println("solution doesn't exists");
        }
    }
}
