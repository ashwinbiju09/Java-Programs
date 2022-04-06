import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        // As nextInt or nextDouble functions does not read the newline of characters We have to declare the below function to get string input.
        scan.nextLine();
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}