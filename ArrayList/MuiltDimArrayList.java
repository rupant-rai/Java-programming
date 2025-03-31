import java.util.*;

public class MuiltDimArrayList {
    public static void main ( String args[]){
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(5);
        mainList.add( list1);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add( list2);

        System.out.println(mainList);


        // to print multi dimensional ArrayList 

        for( int i=0; i<mainList.size(); i++){
            ArrayList<Integer> curList= mainList.get(i);
            for( int j=0; j< curList.size(); j++){
                System.out.print(curList.get(j)+" ");
            }
            System.out.println();
        }

        // another example

        ArrayList<ArrayList<Integer>> larList= new ArrayList<>();
            ArrayList<Integer> list3= new ArrayList<>();
            ArrayList<Integer> list4= new ArrayList<>();
            ArrayList<Integer> list5= new ArrayList<>();

            for( int i=1; i<5; i++){
                list3.add( i*1);
                list4.add( i*2);
                list5.add( i*3);
            }
        larList.add(list3);
        larList.add(list4);
        larList.add(list5);

        System.out.println(larList);
        }
}
