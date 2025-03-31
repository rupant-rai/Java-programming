package Arrays;
//linear seacrch
import java.util.*;
public class arrays2 {
    public static int linSer(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={ 10, 20, 30 , 40 ,50};
        //String items[]={"pen" ,"pencil","eraser"};
        Scanner sc= new Scanner ( System.in);
        System.out.println("enter the key value which u have to search=");
        int key=sc.nextInt();
        // System.out.println("enter they key value string");
        // String keys= sc.nextLine();
        sc.close();
        int index= linSer(numbers, key);
        if(index==-1){
            System.out.println("key value not found");
        }
        else{
            System.out.println("Key value is at " +(index)+" " +"index");
        }

    }
}
