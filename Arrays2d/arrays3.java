package Arrays2d;
//sum of diagonals in a matrix
public class arrays3 {
    public static int diagSum(int matrix[][]){
        int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for( int j=0; i<matrix[i].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }   
        
        //another approach
        for( int i=0; i<matrix.length; i++){
            //pd
            sum+= matrix[i][i];
            //cd
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagSum(matrix));
    }
}
