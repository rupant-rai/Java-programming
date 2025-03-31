package Basics1;
import java.util.*;
public class tenth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number=");
        int num=sc.nextInt();
        switch(num){
            case 1:System.out.println("apple");
            break;
            case 2:System.out.println("banana");
            break;
            case 3:System.out.println("cabbage");
            break;
            case 4:System.out.println("donkey");
            break;
            default: System.out.println("nothing");
            sc.close();
        }
    
    }
    
}
