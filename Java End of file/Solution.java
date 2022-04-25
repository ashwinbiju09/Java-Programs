import java.util.*;

public class Solution{
    public static void main(String []args){
        Scanner x = new Scanner(System.in);
        for ( int i=1 ; x.hasNext() ; i++){
            String s = x.nextLine();
            System.out.println(i+" "+s);
        }
    }
}