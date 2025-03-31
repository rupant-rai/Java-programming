
public class FindPermutations {
    public static void perm(String str, String ans){
        //BAse Case
       if(str.length()==0){
        System.out.println(ans);
        return;
       }

       // recursion

       for( int i=0; i<str.length(); i++){
            char cur=str.charAt(i);
            //if we have to delete a char from the string "abcde" we can do "ab"+"de"="abde"
            String newStr= str.substring(0,i)+str.substring(i+1);
            perm(newStr,ans+cur);
       }
    }
    public static void main(String args[]){
        String str= "abc";
        perm(str,"");
    }
}
