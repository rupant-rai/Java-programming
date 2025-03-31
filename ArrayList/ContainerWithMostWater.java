import java.util.*;

public class ContainerWithMostWater{
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(waterStored(height));
    }

    // public static int waterStored( ArrayList<Integer> height){
    //     int maxWat= 0;
    //     for( int i= 0; i<height.size(); i++){
    //         for( int j=i+1; j< height.size(); j++){
    //             int ht= Math.min(height.get(i), height.get(j));
    //             int wth= j-i;
    //             int totalWater= ht*wth;
    //             maxWat= Math.max( maxWat, totalWater);
    //         }
    //     }
    //     return maxWat;
    // }



    // two pointer approach for the same problem;


    public static int waterStored(ArrayList<Integer> height){
        int maxWat= 0;
        int leftp= 0;
        int rightp= height.size()-1;

        while( leftp< rightp){
            // calculate the current water stored b/w two pointers

            int ht= Math.min(height.get(leftp), height.get( rightp));
            int wth= rightp-leftp;
            int curWat= ht* wth;
            maxWat= Math.max( maxWat, curWat); 


            // update the pointer ; in two pointer approach always move that side which is smaller
            // bcz if we move the larger area we will get the smaller area

            if(height.get(leftp)<height.get(rightp)){
                leftp++;
            }
            else{
                //height.get(leftp)>= height.get(rightp){
                rightp--;
            }
        }
        return maxWat;
    }


}