import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for( int i=0 ; i<n ; i++){
            try{
                long v  = x.nextLong();
                System.out.println(v+" can be fitted in:");
                if(v>=-128 && v<=127)System.out.println("* byte");
                if(v>=-32768 && v<=32767)System.out.println("* short");
                if(v>=-2147483648 && v<=2147483647)System.out.println("* int");
                if(v>=-9223372036854775808L && v<=9223372036854775807L )System.out.println("* long");
            }
            catch(Exception ae){
                System.out.println(x.next()+" can'y be fitted anywhere");
            }
        }
    }
}