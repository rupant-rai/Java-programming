package Arrays2d;
//search for keys in sorted matrix
public class arrays4 {
     public static boolean stairSearch(int matrix[][], int key){
        int row=0;
        int col=matrix[0].length-1;
        while( row<matrix.length &&col>=0){
            if(matrix[row][col]== key){
                System.out.println("element is at key = ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("element not found");
        return false;
     }
     public static void main(String[] args){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key= 46;
        stairSearch(matrix,key);

     }
}
