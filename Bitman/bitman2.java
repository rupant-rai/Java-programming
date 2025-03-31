package Bitman;

public class bitman2 {
    //find whether odd or even

    public static void eo(int n){
        int bitmask=1;
        if( (n & bitmask)==1){
            System.out.println("the number "+ n +" is odd");
        }
        else{
            System.out.println("the number "+n+ " is even");
        }
    }

    //get ith bit

    public static int getith(int n, int i){
        int bitmask= 1<<i;
        if( (n& bitmask)==0){
            System.out.println("ith bit = 0");
            return 0;
        }
        else{
            System.out.println("ith bit = 1");
            return 1;
        }
    }

    //set ith bit

    public static int  setith( int n, int i){
        int bitmask= 1<<i;
        return n | bitmask;
    }

    //clear ith bit

    public static int clrith( int n , int i){
        int bitmask= ~(1<<i);
        return n& bitmask;
    }

    //update it bit

    public static int updateith( int n, int i, int nb){
        if( nb==0){
           return clrith(n,i);
        }
        else{
           return setith(n,i);
        }
    }
    //another method

    public static int updateith2(int n, int i, int nb ){
        n=clrith(n,i);
        int bitmask= nb<<i;
        return n|bitmask;

    }

    //clear i bits 

    public static int clri(int n, int i){
        int bitmask= (~0)<<i;
        return n & bitmask;
    }

    //clear range of bits from i to j

    public static int clrRange(int n, int i, int j ){
        int a= (~0)<<j+1;
        int b= (1<<i)-1;
        int bitmask= a|b;
        return n& bitmask;
    }

    public static int countset(int n){
        int count =0;
        while( n>0){
            int bitmask= 1<<0;//or simply 1
            if((n& bitmask )!= 0){
            count++;
        }
        n=n>>1;
    }
        return count;
    }

    //fast exponentation

    public static int Fastexp( int a, int n){
        int ans= 1;
        while(n>0){
            if( (n& 1)!=0){// allow multiplication only those times when lsb will be 1.
                ans= ans*a;//asociating each bit of power with corresponding a(pow)
            }
            a= a*a;//to make a= a square
            n=n>>1;
        }
        return ans;
    }

    public static void main( String [] args){
        // eo(5);
        // eo(4);

        // getith( 15,3);
        // getith(15,5);

        // System.out.println(setith(10,2)) ;

        //System.out.println(clrith( 10,1));

        //System.out.println(updateith2(10,2,1));

        //System.out.println(clri(15,2));

        //System.out.println(clrRange(74,2,6));

        //System.out.println(countset(15));

        System.out.println(Fastexp(2,10));
    }
}
