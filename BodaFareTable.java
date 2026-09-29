import java.util.Scanner;

public class BodaFareTable {
    // Assuming placeholder values for Module 2 constants
    private static final int BASE_FARE = 2000;
    private static final int RATE_PER_KM = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter maximum distance (in km): ");
        int maxDistance = input.nextint();
        
        System.out.println("\nDistance (km)\tFare (UGX)");
        System.out.println("--------------------------");
        
        for (int km = 1; km <= maxDistance; km++) {
            int fare = BASE_FARE + (km * RATE_PER_KM);
            System.out.println(km + "\t\t" + fare);
        }
        
        input.close();
    }
}
