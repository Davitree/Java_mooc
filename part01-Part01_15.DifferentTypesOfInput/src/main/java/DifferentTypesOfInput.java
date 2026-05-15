
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String value = String.valueOf(scan.nextLine());
        
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double dValue = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean bValue = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "+value);
        System.out.println("You gave the integer "+intValue);
        System.out.println("You gave the double "+dValue );
        System.out.println("You gave the boolean "+bValue);
       
        // Write your program here
        scan.close();
    }
}
