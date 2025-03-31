import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String str){
        Stack <Character> s= new Stack<>();
        for ( int i=0; i< str.length(); i++){
            char ch= str.charAt(i);
            // opening 
            if( ch=='(' ||ch=='{' ||ch=='['){
                s.push(ch);
            }
            else{
                // closing
                if(s.isEmpty()){
                    return false;
                }
                else if(
                    (s.peek()=='(' && ch==')')||
                    (s.peek()=='{' && ch=='}')||
                    (s.peek()== '[' && ch==']')
                ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;//to tackle situation when  any other chracter comes other than braces
        }

    }

    public static void main( String args[]){
        String str= "({[]})";
        System.out.println(isValid(str));

    }
}
