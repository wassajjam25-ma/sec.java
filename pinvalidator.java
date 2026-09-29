import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a 4-digit Mobile Money PIN: ");
            
            // hasNextInt() guard to prevent crashing on non-integer input
            if (input.hasNextInt()) {
                pin = input.nextInt();
                if (pin >= 1000 && pin <= 9999) {
                    isValid = true;
                } else {
                    System.out.println("Error: PIN must be between 1000 and 9999.");
                }
            } else {
                System.out.println("Error: Invalid character entered. Please enter numbers only.");
                input.next(); // Clear invalid token
            }
        }

        System.out.println("PIN successfully validated and accepted.");
        input.close();
    }
}
