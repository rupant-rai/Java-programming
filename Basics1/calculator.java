package Basics1;
import java.util.*;
public class calculator{
    public static void main(String args[]){
        System.out.println("enter the value of a=");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the value of b=");
        int b=sc.nextInt();
        System.out.println("enter operator=");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.println("addition="+(a+b));
            break;
            case '-':
            System.out.println("substraction="+(a-b));
            break;
            case '*':
            System.out.println("multiplication="+(a*b));
            break;
            case '/':
            System.out.println("division="+(a/b));
            break;
            default:
            System.out.println("undefined charecter");
            sc.close();
        }

    }
}