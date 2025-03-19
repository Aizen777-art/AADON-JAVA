import java.util.Scanner;

public class InsuranceEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marital status
        System.out.print("Are you married? (yes/no): ");
        String maritalStatus = scanner.next().trim().toLowerCase();

        // If married, eligible immediately
        if (maritalStatus.equals("yes")) {
            System.out.println("You are eligible for insurance.");
        } 
        else if (maritalStatus.equals("no")) {
            // Get gender
            System.out.print("Enter your gender (male/female): ");
            String gender = scanner.next().trim().toLowerCase();

            // Get age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Eligibility check for unmarried individuals
            if ((gender.equals("male") && age >= 30) || (gender.equals("female") && age >= 25)) {
                System.out.println("You are eligible for insurance.");
            } else {
                System.out.println("You are NOT eligible for insurance.");
            }
        } else {
            System.out.println("Invalid input! Please enter 'yes' or 'no' for marital status.");
        }

        scanner.close();
    }
}
