import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Mobile Money Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Buy Airtime");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Depositing funds...");
                    break;
                case 2:
                    System.out.println("Withdrawing funds...");
                    break;
                case 3:
                    System.out.println("Buying airtime...");
                    break;
                case 0:
                    System.out.println("Exiting menu. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);

        input.close();
    }
}
