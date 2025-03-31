package Strings;
//print the largest string in lexicographical order 
public class string5 {
    public static void main( String [] args){
        //arry of type string
        String fruits[]= {"apple", "mango", "banana"};
        String lar= fruits[0];//let first index is largest
        for( int i=1; i< fruits.length; i++){
            if(lar.compareTo(fruits[i])<0){
                lar=fruits[i];
            }
        }
        System.out.println(lar);
    }
}
