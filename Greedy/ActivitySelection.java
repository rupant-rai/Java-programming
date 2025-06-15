package Greedy;


import java.util.*;

public class ActivitySelection {
    public static void main( String args[]){
        int start[]= {10,12,20};
        int end[]= {20, 25, 30};

        ArrayList<Integer> ans= new ArrayList<>();
        int maxAct= 0;
        ans.add(0);
        int LastEnd= end[0];

        for( int i=1; i<start.length; i++){
            if( start[i]< LastEnd){
                maxAct++;
                ans.add(i);
                LastEnd = end[i];
            }
        }

        System.out.println("maximum activity that can be performed ="+ maxAct);

        for ( int i=0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}
