package Reccursion;

public class recc1 {
    //print numbers from n tp 1 in decreasing order

    // public static void printDec( int n){
    //     if( n==1){
    //         System.out.print(n);
    //         return;
    //     }
    //     System.out.print(n+ "  ");
    //     printDec( n-1);
    // }

    //print numbver s from  1 to n in increasing order

//     public static void printInc( int n){
//         if( n==1){
//             System.out.print(n +" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print( n+ " ");
// }

// find the factorial n

//function
// public static int fact( int n){
//     //base case
//     if( n== 0){
//         return 1;
//     }
//     int factnmo= fact( n-1);
//     int factn= n* factnmo;
//     return factn;
// }


//find sum of first n natural numbers

// public static int sum( int n){
//     if(n==1){
//         return 1;
//     }
//     int fnm1= sum(n-1);
//     int fn= n+ fnm1;
//     return fn;
// }



//print nth fibonacci number


// public static int fib( int n){
//     if (n==0) return 0;
//     if( n==1) return 1;
    
//     int fnm1= fib( n-1);
//     int fnm2= fib( n-2);
//     int fn= fnm1+ fnm2;
//     return fn;
// }


// check wheather given array is sorted or not 

// public static boolean isSorted( int arr[], int i){
//     if(i== arr.length-1){
//         return true;
//     }
//     if(arr[i]> arr[i+1]){
//         return false;
//     }
//     return isSorted(arr, i+1);
// }



// fxn to find first occurence of an key element in given array

// public static int firstOcc( int arr[], int key, int i){
//     //base case
//     if( i== arr.length-1){
//         return -1;
//     }
//     if(arr[i]== key){
//         return i;
//     }
//     //recursive finction
//     return firstOcc( arr, key, i+1);
// }


// fxn to find last occurence of an key element in given array

// public static int lastOcc( int arr[], int key, int i){
//     //base case
//     if (i== arr.length-1) return -1;
// // look forward
//     int isfound= lastOcc(arr, key, i+1);
//     if( isfound==-1 && arr[i]==key){
//         return i;
//     }
//     return isfound;

// }




// print x to the ower n . using reccursion 

// public static int pow( int x, int n){
//     if( n==1){
//         return x;
//     }
//     //reccursive fuction call
//     int xnm1= pow(x,n-1);
//     int xn= x* xnm1; 
//     return xn;
// }


// another optimised approach for the same x to the power n

public static int optPow( int x, int n){
    if ( n==0){
        return 1;
    }
    // if n is even 
    int halfpow= optPow( x, n/2)* optPow(x, n/2);
    // if n is odd
    if( n%2!= 0){
        halfpow= x* halfpow;
    }
     return halfpow;

}
   public static void main( String args[]){
    //int n=5;
    //printDec(n);

    //printInc(n); 

    //System.out.println(fact(n));

    //System.out.println( sum(n));

    //System.out.println(fib(n));
    
    //int arr[]= { 1,2,3,4,5};

    //System.out.println(isSorted(arr,0));

    //System.out.println(lastOcc(arr,4,0));

    //System.out.println(pow(2,10));
    System.out.println( optPow(2, 10));
   } 
}
  