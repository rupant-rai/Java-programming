package Greedy;


import java.util.*;

// when the  given array is not sorted 

public class ActivitySelectionII {
    public static void main( String args[]){
        int start[]= {0, 1, 3, 5, 5, 8};
        int end[]= {6, 2, 4, 7, 9, 9};

        int activities[][]= new int [start.length][3];

        // sorting in the 2d matrix

        Arrays.sort(activities, Comparator.comparingDouble(o-> o[2]));

        for( int i=0; i< start.length; i++){
            activities[i][0]= i;
            activities[i][1]= start[i];
            activities[i][2]= end[i];
        }

        ArrayList<Integer> ans= new ArrayList<>();
        int maxAct=0;
        ans.add(activities[0][0]);
        int LastEnd= activities[0][2];

        for ( int i=1; i<start.length; i++){
            if( activities[i][1]< LastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                LastEnd= activities[i][2];
            }
        }

        System.out.println("maximum activityy that can be performed = "+ maxAct);

        for (int i=0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }  
    }
}
