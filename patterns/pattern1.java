package patterns;
//programm to print hollow rectangle
public class pattern1 {
    //public static void main(String[]args){
    // int ttr=5;
    // int ttc=6;
    // for(int i=1; i<=ttr; i++){
    //     for(int j=1; j<=ttc; j++){
    //         if(i==1||i==ttr||j==1||j==ttc){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // } 



//inverted and half pyramid 
public static void pattern2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
    }
}

//inverted pyramid pattern
public static void pattern3(int n){
    for(int i=1; i<=n; i++){
        //stars
        for(int j=1; j<=n+1-i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=i-1; j++){
            System.out.print(" ");
        }
    System.out.println();
    }
}


// inverted half pyramid pattern with numbers
public static void pattern4(int n){
    for (int i=1 ; i<=n ; i++){
        for( int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
    System.out.println();
    }
} 


//floyd's triangle pattern
public static void pattern5(int n){
    int counter =1;
    for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(counter+"  ");
            counter++;
        }
    System.out.println();
    }
}

//Diamond pattern
public static void pattern6(int n){
    for (int i=1; i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
    System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
    System.out.println();
    }

}


//01 traingle pattern
public static void pattern7(int n){
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

//butterfly pattern

public static void pattern8(int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }
    System.out.println();
    }
    for (int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }
    System.out.println();
    }
}

// solid rhombus pattern

public static void pattern9(int n){
    for (int i=1; i<=n; i++){
        for( int j=1; j<=n-i+1; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void main(String[] args){
    pattern7(5);
}
}

