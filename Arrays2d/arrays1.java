package Arrays2d;
//creating, taking input, and printing and searching an element in 2d array 
import java.util.*;
public class arrays1 {
   
    
    // searching an element in the give array
    public static boolean search( int matrix[][], int key){
        for( int i=0; i< matrix.length; i++){
            for( int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]==key){
                System.out.println("element is found at index = "+ "(" +i+","+j+")");
                return true;
                }
            }
        }
        System.out.println("element not found");
        return false;
        
    }

    public static void print( int matrix[][]){
        for( int i=0; i<matrix.length; i++){
            for( int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //largest and smallest element 
    public static void largest( int matrix[][]){
        int largest= Integer.MIN_VALUE;
        int smallest= Integer. MAX_VALUE;
        for( int i =0; i<matrix.length; i++){
            for( int j=0 ; j<matrix[0].length; j++){
                if(largest<matrix[i][j]){
                    largest= matrix[i][j];
                }
                if ( smallest>matrix[i][j]){
                    smallest= matrix[i][j];
                }
            }
        }
        System.out.println("largest element is = "+largest);
        System.out.println("smallest element is = "+smallest);
    }

    public static void main(String[] args){
        int matrix[][]=new int[3][3];
        Scanner sc= new Scanner(System.in);
        int n= matrix.length;
        int m= matrix[0].length;
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        sc.close();
        print(matrix);
        search(matrix,6);
        largest(matrix);
    }
    
}
