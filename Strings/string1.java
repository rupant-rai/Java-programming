package Strings;
//import java.util.*;
public class string1 {
    public static void main(String [] args){
        //char
        //char arr[]={'a','b','c'};

        // //string creation

        // String word= "word";
        // String words= new String("word");

        //taking string as an input

        // Scanner sc= new Scanner( System.in);
        // System.out.println("enter a line = ");
        // String wor=sc.nextLine();
        // System.out.println("enter a word = ");
        // String wor2 = sc.next();
        // sc.close();
    
        // System.out.println(word);
        // System.out.println(words);
        // System.out.println(wor);
        // System.out.println(wor2);

        //length of a string

        // System.out.println(wor.length());

        //cocatenation

        String first= "rupant";
        String last = "rai";
        String full= first+ " "+ last;
        System.out.println(full);
 
        //print value of required index
        System.out.println(full.charAt(3));

        //function call to print all the characters inside the string seperately
        printl(full);
    }


    //function to print all letters in the string
    public static void printl( String str){
        for( int i=0; i< str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
  
    }
}