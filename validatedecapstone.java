import java.util.Scanner;

public class ResultProcessorValidated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = -1;
        boolean validMark = false;

        // Example loop setup structured exactly like an age validation workflow
        while (!validMark) {
            System.out.print("Enter coursework mark (0-100): ");
            if (input.hasNextInt()) {
                marks = input.nextInt();
                if (marks >= 0 && marks <= 100) {
                    validMark = true;
                } else {
                    System.out.println("Invalid range! Marks must stay between 0 and 100.");
                }
            } else {
                System.out.println("Invalid numeric data input.");
                input.next(); 
            }
        }

        System.out.println("Mark recorded successfully: " + marks);
        input.close();
    }
}
