package Greedy;


import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]){
        int val[]= {60,100,120};
        int wt[]= {10,20,30};
        int w=50;

        double ratio[][]= new double[val.length][2];

        for (int i=0; i< val.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= val[i]/(double)wt[i];
        }

        // sort the ratio

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        //now the sorting is based on ascending order but we need in the decsending order
        // we will start the loop from the end

        int capacity=w;
        int finalVal=0;

        for( int i= val.length-1; i>=0; i--){
            int idx= (int)ratio[i][0];
            if(capacity>= wt[idx]){
                finalVal+=val[idx];
                capacity-=wt[idx];
            }
            else{
                finalVal+= ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }

        System.out.println("max value= "+finalVal);
    }
}
