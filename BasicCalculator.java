import java.util.Scanner;

public class BasicCalculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /) or 'exit' to quit: ");
            String op = scanner.next();

            if (op.equalsIgnoreCase("exit")) {
                System.out.println("Calculator exited.");
                break;
            }

            if (!op.matches("[+\\-*/]")) {
                System.out.println("Invalid operator. Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (op) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Unexpected error.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

       

