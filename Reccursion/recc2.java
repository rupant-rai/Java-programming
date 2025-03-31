package Reccursion;
// tilling problem floor = 2*n, tiles 2*1;
public class recc2 {
    // public static int tilprb(int n){
    //     //base case
    //     if(n==0|| n==1){
    //         return 1;
    //     }
    //     // Kam kya karna hai
    //     // for vertical choice
    //     int vert= tilprb(n-1);
    //     // for horizontal choice
    //     int horz= tilprb(n-2);
    //     int ways= vert+horz;
    //    return ways;
    //}  


    // remove duplicates in the string


    // public static void remDup( String str, int i, StringBuilder newStr, boolean map[]){
    //     // base case
    //     if(i==str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     // kam

    //     char current= str.charAt(i);
    //     if(map[current-'a']==true){
    //         remDup(str,i+1, newStr, map);
    //     }
    //     else{
    //         map[current-'a']= true;
    //         remDup(str, i+1, newStr.append(current), map);
    //     }
    // }


    //friends pairing

    public static int frendsPair(int n){
        //Base case
        if( n==1 || n==2) return n;
        //kam
    
        return frendsPair(n-1)+(n-1)*frendsPair(n-2);
    }


// binary String Prblm

public static void BinStr( int n, int lastPlace, String str){
    // base case
    if(n==0){
        System.out.println(str);
        return ;
    }
    //kam
    BinStr(n-1,0,str+"0");
    if(lastPlace==0){
        BinStr(n-1, 1, str+"1");
    }
}

    public static void main( String args[]){
    //     System.out.println(tilprb(5));

    // String str= "appnnacollege";
    // remDup(str,0, new StringBuilder(""), new boolean [26]);

    // System.out.println(frendsPair(10));

    BinStr(3,0,"");

    }
}
