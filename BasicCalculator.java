// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class BasicCalculator {
   public BasicCalculator() {
   }

   public static double add(double a, double b) {
      return a + b;
   }

   public static double subtract(double a, double b) {
      return a - b;
   }

   public static double multiply(double a, double b) {
      return a * b;
   }

   public static double divide(double a, double b) {
      if (b == 0.0) {
         System.out.println("Error: Division by zero.");
         return Double.NaN;
      } else {
         return a / b;
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      while(true) {
         while(true) {
            System.out.print("Enter operator (+, -, *, /) or 'exit' to quit: ");
            String op = scanner.next();
            if (op.equalsIgnoreCase("exit")) {
               System.out.println("Calculator exited.");
               scanner.close();
               return;
            }

            if (!op.matches("[+\\-*/]")) {
               System.out.println("Invalid operator. Try again.");
            } else {
               label41: {
                  System.out.print("Enter first number: ");
                  double num1 = scanner.nextDouble();
                  System.out.print("Enter second number: ");
                  double num2 = scanner.nextDouble();
                  double result;
                  switch (op.hashCode()) {
                     case 42:
                        if (!op.equals("*")) {
                           break label41;
                        }

                        result = multiply(num1, num2);
                        break;
                     case 43:
                        if (!op.equals("+")) {
                           break label41;
                        }

                        result = add(num1, num2);
                        break;
                     case 45:
                        if (!op.equals("-")) {
                           break label41;
                        }

                        result = subtract(num1, num2);
                        break;
                     case 47:
                        if (op.equals("/")) {
                           result = divide(num1, num2);
                           break;
                        }
                     default:
                        break label41;
                  }

                  System.out.println("Result: " + result);
                  continue;
               }

               System.out.println("Unexpected error.");
            }
         }
      }
   }
}
