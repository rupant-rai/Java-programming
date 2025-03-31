import java.util.*;

public class ReverseString {
    public static String reverse( String str){
        Stack<Character> s= new Stack<>();
        int i=0;

        // for pushing all the character of the strings in the stack  
        while(i< str.length()){
            s.push(str.charAt(i));
            i++;
        }

        // for poping all the character of the strings in the staclk and storing it in the a varable and returning it
        StringBuilder result= new StringBuilder("");
        while( !s.isEmpty()){
            char curr= s.pop();
            result.append( curr);
        }
        return result.toString();
    }
    public static void main( String args[]){
        String str= " abc";
        String result= reverse(str);
        System.out.println(result);
    }
}
