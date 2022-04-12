import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0 ; i<3 ; i++){
        String a = obj.next();
        int b = obj.nextInt();
        System.out.printf("%-15s%03d\n",a,b);
        }
        System.out.println("================================");

    }
}
