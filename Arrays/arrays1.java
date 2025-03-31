package Arrays;
public class arrays1 {

    public static void update( int marks[],int fixed){
        fixed=20;
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={12,13,14,15};
        int fixed=10;
        update(marks,fixed);
        System.out.println(fixed);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}