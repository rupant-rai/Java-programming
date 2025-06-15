package Greedy;


import java.util.*;

public class MinAbsoluteDiffPairs{
    public static void main( String args[]){
        int a[]= {1,3,2};
        int b[]= {2,3,1};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDif= 0;

        for( int i=0; i< a.length; i++){
            minDif+=Math.abs(a[i]-b[i]);
        }

        System.out.println("minimum diff= "+ minDif);
    }
}