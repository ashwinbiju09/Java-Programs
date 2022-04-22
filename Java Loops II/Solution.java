import java.util.*;

public class Solution{
    public static void main(String[] args){
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        int s = obj.nextInt();
        for( int i=0 ; i<s ; i++ ){
            int a = obj.nextInt();
            int b = obj.nextInt();
            int n = obj.nextInt();
            if( (n>=1&&n<=15) && (a>=0&&a<=50) && (b>=0&&b<=50) ){
                for( int j=0 ; j<n ;j++ ){
                    int x = (int)Math.pow(2,j)*b;
                    sum = sum + x;
                    int v = sum + a;
                    System.out.print(v+" ");
                }
                sum=0;
                int v=0;
                System.out.println("");
            }
        }
    }
}
