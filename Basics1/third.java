package Basics1;
import java.util.*;
public class third {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("bill is="+total);
        float newTotal=total+(0.18f*total);
        System.out.println("new bill with GST="+newTotal);
        sc.close();
    }
}
