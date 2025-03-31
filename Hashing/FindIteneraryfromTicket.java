import java.util.*;

public class FindIteneraryfromTicket {
    public static void main (String args[]){
        HashMap<String, String> tickets= new HashMap<>();
        tickets.put("c", "b");
        tickets.put("m", "d");
        tickets.put("g", "c");
        tickets.put("d", "g");

        String start= getStart(tickets);
        System.out.print(start);

        while (tickets.containsKey(start)) { 
            start = tickets.get(start);
            System.out.print(" -> " + start);
        }
        System.out.println();
    }

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap= new HashMap<>();
        for( String key: tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for( String key: tickets.keySet()){
            if( !revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
