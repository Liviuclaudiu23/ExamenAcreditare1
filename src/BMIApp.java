import java.util.ArrayList;
import java.util.Scanner;

public class BMIApp {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Register new user");
            System.out.println("2. Calculate BMI");
            System.out.println("3. Show user statistics");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.println("\nUser registration\n");
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();
                    System.out.println("\nUser registered successfully!\n");
                    break;
                case 2:
                    System.out.println("\nBMI calculation\n");
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    User currentUser = findUser(userName);
                    if (currentUser == null) {
                        System.out.println("User not found. Please register first.");
                        break;
                    }
                    System.out.print("Enter your weight (kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Enter your height (m): ");
                    double height = scanner.nextDouble();
                    double bmi = BMICalculator.calculateIMC(weight, height);
                    currentUser.addBMI(bmi);
                    System.out.printf("\nYour BMI is %.2f. Your health status is: %s\n\n",
                            bmi, BMICalculator.getHealthStatus(bmi));
                    break;
                case 3:
                    System.out.println("\nUser statistics\n");
                    System.out.print("Enter your name: ");
                    userName = scanner.nextLine();
                    currentUser = findUser(userName);
                    if (currentUser == null) {
                        System.out.println("User not found. Please register first.");
                        break;
                    }
                    System.out.printf("\nUser: %s\n", currentUser.getName());
                    System.out.printf("Number of BMI measurements: %d\n", currentUser.getNumMeasurements());
                    System.out.printf("Average BMI: %.2f\n\n", currentUser.getAverageBMI());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();

    }

    private static User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

}

