import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.Module); // Or System.in
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your attendance percentage: ");
        double attendance = input.nextDouble();
        
        if (attendance >= 75.0) {
            System.out.println("Eligible for exams.");
        } else if (attendance >= 60.0) {
            System.out.println("Eligible with a warning letter.");
        } else {
            System.out.println("Not eligible – see the Dean of Students.");
        }
        
        input.close();
    }
}
