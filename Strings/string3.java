package Strings;
//determine the shortest path to travel to the last of given string
public class string3 {
    public static float shortpath( String path){
          int x=0; 
          int y=0;
          for( int i=0; i< path.length(); i++){
            char dir= path.charAt(i);
            //north
            if( dir== 'n'){
                y++;
            }
            //south
            else if( dir== 's'){
                y--;
            }
            //west
            else if( dir=='w'){
                x--;
            }
            else{
                x++;
            }
          }
          int X2= x*x;
          int Y2= y*y;
          return ( float)Math.sqrt(X2+Y2);
    }
    public static void main( String[] args){
        String Gpath= "wneenesennn";
        System.out.println(shortpath(Gpath));
    }
}
