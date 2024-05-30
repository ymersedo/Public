import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Lines of code inside the try block will be checked for exceptions
        try {
            System.out.println("Please enter a number: ");
            int num = scanner.nextInt();

            System.out.println("The number you've entered is: " + num);
        }
        // This will catch any exceptions
        catch(Exception e) {
            System.out.println("Error running code!");
        }
        // This will always execute
        finally {
            scanner.close();
            System.out.println("Scanner closed!");
        }
    }
}
