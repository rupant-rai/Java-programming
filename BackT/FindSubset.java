

public class FindSubset {
    public static void FindSubset1(String str, String ans, int i){
        // Base Case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        // Reccursion
        FindSubset1(str,ans+str.charAt(i),i+1);//if choosen
        FindSubset1(str, ans, i+1);// if not choosen
    }

    public static void main( String args[]){
        String str="abc";
        FindSubset1(str,"",0);
    }
}
