import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // Get user choice
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Input numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform selected operation
            switch (choice) {
                case 1:
                    performAddition(num1, num2);
                    break;
                case 2:
                    performSubtraction(num1, num2);
                    break;
                case 3:
                    performMultiplication(num1, num2);
                    break;
                case 4:
                    performDivision(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    private static void performAddition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

