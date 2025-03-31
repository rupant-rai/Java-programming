
//import java.util.*;

//public class pratice1 {
//     public static void ( String[] args){
//     int row=5;
//     int col=5;
//     for( int i=1; i<=row; i++){
//         for( int j=1; j<=col; j++){
//             if( i==1||i==row||j==1||j==col){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }}


public class practise{
    public static void pattern1(int n){
        for( int i=1; i<=n; i++){
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for( int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pattern2(int n){
        //diamond pattern
        for( int i=1; i<= n; i++){
            for ( int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for( int j= 1; j<= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for( int i=n; i>=1; i--){
            for( int j=n-i; j>=1; j--){
                System.out.print("  ");
            }
            for( int j=2*i-1; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //floyd'ss triange
    public static void pattern3(int n){
        int h=1;
        for( int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(h+" ");
                h++;
            }
            System.out.println();
        }
    }

    //01 triangle
    public static void pattern4( int n){
    for( int i=1 ; i<= n; i++){
        for( int j=1; j<= i; j++){
            if( (i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}


    //butterfly pattern
    public static void pattern5 (int n){
        for( int i=1; i<= n; i++){
            for( int j=1; j<= i; j++){
                System.out.print("*");
            }
            for( int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=n; i>=1; i--){
            for( int j=i; j>= 1; j--){
                System.out.print("*");
            }
            for( int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
            for( int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    // rhombus pattern
    public static void pattern6(int n){
        for( int i= 1; i<=n; i++){
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for( int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //factorial
    public static int factorial( int n){
        int fact=1;
        for( int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    //binomial function
    public static int fact( int num){
        int f= 1;
        for( int i=1; i<=num; i++){
            f*=i;
        }
        return f;
    }
    public static int bin(int n,int r){
        int factn= factorial(n);
        int factr= factorial(r);
        int factnmr= factorial(n-r);
        int bc= factn/(factnmr*factr);
       // System.out.println("binomial coefficient ="+ bc);
        return bc;

    }

    //prime number or not?
    public static boolean prime(int n){
        
        
        
        for( int i=2; i<=n-1; i++){
            if(n%i==0){
                
                return false;
            }
        }
        return true;
        
    }

    //prime in range


    public static void allprime( int m){
        for( int i=2; i<=m; i++){
            if(prime(i)==true){
                System.out.print( i+ " ");
            }
        }
    }

    public static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // binary to decimal
    public static void btd( int bn){
        int mynum= bn;
        int power=0;
        int dn=0;
        while( bn>0){
            int ld= bn%10;
            dn+=ld*(int)Math.pow(2,power);
            bn=bn/10;
            power++;
        }
        System.out.println("decimal number of "+mynum+" ="+dn);
    }

    //decimal to binary

    public static void dtb( int dn){
        int mynum= dn;
        int power=0;
        int bn=0;
        while( dn>0){
            int ld= dn%2;
            bn+=ld*(int)Math.pow(10,power);
            power++;
            dn=dn/2;
        }
        System.out.println("binary number of "+mynum+"= "+bn);
    }

    //palindrome

    public static boolean palindrome( int num){
        int n=num;
        int rev=0;
        while(n>0){
            int rem= n%10;
            rev= rev*10+rem;
            n= n/10;
            if(rev!=n);
        }
        if(num==rev){
            return true;
        }
        else{
            return false;
        }
    }


    //sum of digits in an integer

    public static int sum( int n){
        int sum= 0;
        while( n>0){
            int ld= n%10;
            sum=sum+ld;
            n= n/10;
        }
        return sum;
    }

    //updating array elemnets

    public static void update(int arr[]){
        for(int i=0;i<arr.length; i++){
            arr[i]= arr[i]+1;
        }
    }

    //linear search
    public static int Linser( int arr[], int key){
        for(int i= 0; i< arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //largest and smallest in array
    public static int comp( int arr[]){
        int lar= Integer.MIN_VALUE;
        int small= Integer.MAX_VALUE;
        for( int i=0; i< arr.length; i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
            if( small>arr[i]){
                small= arr[i];
            }
            
        }
        System.out.println(small);
        return lar;
    }

    //binary search

    public static int Binser( int arr[], int key){
        int start=0;
        int end= arr.length-1;
        //loop
        while(start<=end){
            int mid= (start+ end)/2;
            if( arr[mid]==key){
                return mid;
            }
            if( arr[mid]<key){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }

    //reverse an array

    public static void rev( int arr[]){
        int start= 0;
        int end= arr.length-1;
        while( start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr [end]= temp;
            start++;
            end--;
        }
    }

    //elemnet pairs of array

    public static void pairs( int arr[]){
        for( int i=0; i<arr.length-1; i++){
            int current= arr[i];
            for( int j=i+1; j< arr.length; j++){
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    //subarray
    public static void subarrays(int arr[]){
        for( int i=0;i<arr.length;i++){
            for( int j=i; j<arr.length; j++){
                for( int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //max sub array
    public static void Max( int arr[]){
        int csum=0;
        int msum= Integer.MIN_VALUE;
        for( int i=0; i<arr.length; i++){

            for( int j=i; j<arr.length; j++){
                for( int k=i; k<=j; k++){
                    csum+=arr[k];
                }
                System.out.println(csum);
                if( msum<csum){
                    msum= csum;
                }
            }
        }
        System.out.println(msum);
    }

    //maxsub array using prefix
    public static void prefix(int arr[]){
        int csum=0;
        int msum= Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];
        for( int i= 1; i< arr.length; i++){
            prefix[i]= prefix[i-1]+ arr[i];
        }
        for( int i= 0;i< arr.length; i++){
            for( int j= i; j< arr.length; j++){
                csum= i==0? prefix[j]:prefix[j]- prefix[i-1];
                if( msum< csum){
                    msum= csum;
                }
            }
        }
        System.out.println(msum);

    }

    // another method ... Kadans theorem
    //logic- when negative then 0

    public static void kadanes( int arr[]){
        int csum=0;
        int msum= Integer.MIN_VALUE;
        for( int i=0; i< arr.length; i++){
            csum+= arr[i];
            //kadanes algo
            if( csum<0){
                csum=0;
            }
            msum= Math.max( csum, msum);
        }
        System.out.println(msum);
    }

    //Trapping rainwater algo

    public static int tw(int height[]){
        int lm[]= new int [height.length];
        lm[0]= height[0];
        int n= height.length;
        for( int i=1; i<n; i++){
            lm[i]= Math.max(height[i], lm[i-1]);
        }

        int rm[]= new int[n];
        rm[n-1]= height[n-1];
        for( int i=n-2; i>=0; i--){
            rm[i]= Math.max(height[i], rm[i+1]);
        }

        int wt= 0;
        for( int i=0; i<n; i++){
            int wl= Math.min(lm[i], rm[i]);
            wt+=wl-height[i];
        }
        return wt;
    }

    //leetcode question
    public static int bs( int arr[], int key){
    int start=0;
    int end= arr.length-1;
    for( int i=0; i<arr.length; i++){
        while(start<end){
            int mid= ( start+ end)/2;
            
            if(arr[mid]== key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;

            }
            else{
                end= mid-1;
            }
            int k=mid+1;
            while(k<=end){
                if( key==arr[k]){
                    System.out.print(k+ " ");
                    k++;
                }
            }
        }
    }
   
    return -1;
}

//best time to buy and sell stock
public static int buysell(int prices[]){
    int bp= Integer.MAX_VALUE;
    int maxprofit=0;
    for( int i=0; i< prices.length; i++){
        if( bp<prices[i]){
            int profit= prices[i]- bp;
            maxprofit= Math.max( profit, maxprofit);
        }
        else{
            bp= prices[i];
        }
    }
    return maxprofit;
}


//Some sorting algos

//bubble sort
public static void bsort(int arr[]){
    // number of turn turns= n-1,position =0 to n-2
    for( int i=0; i<arr.length-1;i++){
        boolean swap= false;
        for( int j=0; j< arr.length-1-i; j++){
            if( arr[j]>arr[j+1]){
                int temp= arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                swap= true;
            }
        }
        if(!swap){
            break;
        }
    }
}

//print the sorted the array
public static void print( int arr[]){
    for( int i= 0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

//selection sort
//pick smallest element, put it at the begining

public static void ssort( int arr[]){
    for( int i=0; i< arr.length-1; i++){
        int smallest= i;
        //unsorted array starts from i+1
        for( int j=i+1; j<arr.length; j++){
             if( arr[smallest]>arr[j] ){
                smallest= j;
             }
        }
        int temp= arr[ smallest];
        arr[ smallest]= arr[i];
        arr[ i]= temp;
    }
}

//Insertion sort
//pick an element from the unsorted part and place at the right position in the sorted array

public static void isort( int arr[]){
    for( int i=1; i< arr.length; i++){
     int cur=arr[i];
     int prev= i-1;
     while(prev>=0&&arr[prev]>cur ){
        arr[prev+1]= arr[prev];
        prev--;
     }
     arr[prev+1]= cur;
    }
}

//counting sort

public static void csort( int arr[]){
    //largest element or range
    int lar= Integer.MIN_VALUE;
    for( int i=0; i< arr.length; i++){
        lar= Math.max( lar, arr[i]);
    }

    //count
    int count[]= new int[lar+1];
    for( int i= 0; i< arr.length; i++){
        count[arr[i]]++;
    }
    //sorting
    int j=0;
    for( int i=0; i<count.length; i++){
        while( count[i]>0){
            arr[j]= i;
            j++;
            count[i]--;
        }
    }

}

//searching in a 2d array
public static boolean search( int matrix[][] ,int key){
    for( int i= 0; i< matrix.length; i++){
        for( int j=0; j< matrix[0].length; j++){
            if( matrix[ i][j]==key){
                System.out.println("Index of element is = ("+i+","+j+")");
                return true;
            }
        }
    }
    System.out.println("element not found ");
    return false;
}

//function to print the array
public static void printa(int matrix[][]){
    for( int i=0; i< matrix.length; i++){
        for( int j=0; j< matrix[0].length; j++){
            System.out.println(matrix[i][j]);
        }
    }
}

//print lrgest and smalllest array in the 2d array
public static void comp( int matrix[][]){
    int lar= Integer.MIN_VALUE;
    int small= Integer.MAX_VALUE;
    for( int i=0; i< matrix.length; i++){
        for( int j=0; j< matrix[0].length; j++){
            if( lar<matrix[i][j]){
                lar= matrix[i][j];
            }
            if( small> matrix[i][j]){
                small= matrix[i][j];
            }
        }
    }
    System.out.println("largest element is "+lar);
    System.out.println("Smallest element is "+small);

}

//spiral matrix
public static void spiral( int matrix[][]){
int sr=0;
int sc=0;
int er=matrix.length-1;
int ec= matrix[0].length-1;
while(sr<=er && sc<= ec){
    //top
    for(int j=sc; j<=ec; j++ ){
        System.out.println(matrix[sr][j]);
    }
    //right
    for( int i= sr+1; i<=er; i++){
        System.out.println(matrix[i][ec]);
    }
    //bottom
    for ( int j=ec-1; j>=sc; j--){
        System.out.println(matrix[er][j]);
    }
    //left
    for( int i= er-1; i>= sr+1; i--){
        System.out.println(matrix[i][sc]);
    }
    sr++;
    sc++;
    er--;
    ec--;
}
}

//sum of the diagonals in the matrix

public static void diasum(int matrix[][]){
    int sm=0;
//     for( int i=0; i<= matrix.length-1; i++){
//         for( int j=0; j<= matrix[0].length-1; j++){
//             if( i==j){
//                 sm += matrix[i][j];
//             }
//             else if( i+j== matrix.length-1){
//                 sm += matrix[i][j];
//             }
//         }
//     }

//another approach

for( int i=0; i<=matrix.length-1; i++){
    sm+=matrix[i][i];
    if( i!=matrix.length-1-i){
        sm+= matrix[i][matrix.length-1-i];
    }
}
System.out.println(sm);
}

//search elements in a 2d array using stair case searching method
public static boolean stairs( int matrix[][], int key){
    int row= 0;
    int col= matrix[0].length-1;
    while( row<matrix.length && col>=0)
    {
        if( matrix[row][col]==key){
            System.out.println("Element is present at ("+row+","+col+")");
            return true;
        }
        else if ( matrix[row][col]<key){
            row++;
        }
        else{
            col--;
        }
    }
    System.out.println(" element not found");
    return false;

}
//function to print all the letter in the string
public static void letters( String str ){
    for( int i=0; i< str.length(); i++){
        System.out.println(str.charAt(i));
    }
    System.out.println();
}

//check palindrome

public static boolean palind( String str){
    for ( int i= 0; i< str.length()/2; i++){
        int n= str.length()-1;
        if( str.charAt(i)!= str.charAt(n-i-1)){
            System.out.println("not palindrome");
            return false;
        }
    }
    System.out.println("palindrome");
    return true;
}

//shortest path

public static float ShortestPath( String str){
    int x=0;
    int y=0;
    for ( int i=0; i< str.length(); i++){
        char dir= str.charAt(i);
        if( dir=='n'){
            y++;
        }
        else if( dir== 's'){
            y--;
        }
        else if ( dir== 'e'){
            x++;
        }
        else{
            x--;
        }
    }
        int x2= x*x;
        int y2= y*y;
       return (float)Math.sqrt(x2+y2);
}

// convert first letter of word into upper case using string builder

public static String upper( String str){
    StringBuilder sb= new StringBuilder("");
    char ch= Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for ( int i=1; i<str.length(); i++ ){
        if(str.charAt(i)==' '&& i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
    public static void main( String[] args){
        // pattern1(5);
       
        //pattern2(5);
       
        // pattern3(5);
       
        //pattern4(5);
      
        //pattern5(5);
      
        //pattern6(5);
        
        //System.out.println(factorial(5));
        
        //System.out.println(bin(5,1));
       
        // boolean isprime= prime(5);
        // if( isprime==true){
        //     System.out.println("number is prime");
        // }
        // else{
        //     System.out.println("Number is not prime ");
        // }

        //allprime(50);

       // pattern7(6);

       //btd(111);

       //dtb(15);

        //    boolean p= palindrome(121);
        //    if(p==true){
        //     System.out.println("palindrome");
        //    }
        //    else{
        //     System.out.println("not palindrome");
        //    }

        //System.out.println(sum(135));

        // int arr[]= {12,13,14,15};
        // update(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int arr[]= {1,2,3,4,5};
        // int key = 5;
        // System.out.println("key is at index : "+Linser(arr,key));

        // int arr[]= {1,2,3,4,5,6,7};
        // System.out.println(comp(arr));

        // int arr[]= {10, 12, 13, 14 ,15};
        // int key= 14;
        // System.out.println(Binser(arr,key));

        // int arr[]= {10, 12, 14 ,16};
        // rev(arr);
        // for( int i=0; i< arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int arr[]= {12,14, 15, 16};
        // pairs(arr);

        // int arr[]= {11, 12, 13, 14};
        // subarrays(arr);

        // int arr[]={ 15,20,25,30};
        // Max( arr);

        // int arr[]= { 1,2,3,4,5};
        // prefix(arr);

        // int arr[]= {1,2,3,4,5};
        // kadanes(arr);

        // int height[]= {4,2,0,6,3,2,5};
        // System.out.println("watter Trapped = "+tw(height));

        // int arr[]= {5,7,7,8,8,10};
        // int key=8;
        // System.out.print(bs(arr,key));

        // int prices[]= {7,1,5,3,6,4};
        // System.out.println(buysell(prices));

        // int arr[]= { 4, 3, 7,34, 45, 3, 6};
        // bsort( arr);
        // print( arr);
       
        // int arr[]= { 4, 3, 7,34, 45, 3, 6};
        // ssort( arr);
        // print( arr);

        // int arr[]= { 4, 3, 7,34, 45, 3, 6};
        // isort( arr);
        // print( arr);

        // int arr[]= { 4, 3, 7,34, 45, 3, 6};
        // csort( arr);
        // print( arr);
        
        // int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
        // search(matrix,6);
        // comp(matrix);

        // int matrix[][]= {{1,2,3},
        //                  {4,5,6},
        //                  {7,8,9}};
        // spiral( matrix);

        // int matrix[][]= {{1,2,3},
        //                  {4,5,6},
        //                  {7,8,9}};
        // diasum( matrix);

        // int matrix[][]= {{1,2,3},
        //                  {4,5,6},
        //                  {7,8,9},
        //                 {10,11,12}};
        // int key=1;
        // System.out.println(stairs( matrix, key));




        // char arr[]={'a','b','c'};
        // String str= "rupant";
        // String str2= new String("rupant");
        // Scanner sc= new Scanner( System.in);
       
        // String b= sc.nextLine();
        // String a= sc.next();

        // sc.close();

        // for( int i=0; i< arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        // System.out.println();
        // System.out.println(str);
        // System.out.println(str2);
        // System.out.println(a);
        // System.out.println(b);


        // String str= "rupant rai";
        // letters(str);

        // String str= "racecar";
        // palind(str);

        // String str= "nnnssswwwsseesseeennnnn";
        // System.out.println(ShortestPath(str));

        //print largest string
        // String fruits[]= {"apple", "mango", "banana"};
        // String lar= fruits[0];
        // for( int i=1; i< fruits.length; i++){
        //     if( lar.compareTo(fruits[i])<0){
        //         lar= fruits[i];
        //     }
        // }
        // System.out.println();


        //modify in a string using StringBuilder
        //  StringBuilder sb= new StringBuilder("");
        // for( char ch= 'a'; ch< 'z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        String str= "hi i am rupant";
        System.out.println(upper(str));
    }
}