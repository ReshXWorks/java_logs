import java.util.Scanner;

public class Calculator{
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number not defined.");
        }
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("==== Scientific Calculator ====");
        System.out.println("Available operations:");
        System.out.println("+  -  *  /  %  ^  sqrt  !  sin  cos  tan  exit");

        while (running) {
            System.out.print("\nEnter operation: ");
            String operator = sc.next();

            if (operator.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num1, num2, result = 0;

            switch (operator) {
                case "+": case "-": case "*": case "/": case "%": case "^":
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/":
                            if (num2 != 0) result = num1 / num2;
                            else {
                                System.out.println("Error: Division by zero!");
                                continue;
                            }
                            break;
                        case "%": result = num1 % num2; break;
                        case "^": result = Math.pow(num1, num2); break;
                    }
                    System.out.println("Result: " + result);
                    break;

                case "sqrt":
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Result: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: Cannot take sqrt of negative number!");
                    }
                    break;

                case "!":
                    System.out.print("Enter an integer: ");
                    int n = sc.nextInt();
                    try {
                        System.out.println("Result: " + factorial(n));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "sin": case "cos": case "tan":
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    double radians = Math.toRadians(num1);
                    switch (operator) {
                        case "sin": result = Math.sin(radians); break;
                        case "cos": result = Math.cos(radians); break;
                        case "tan": result = Math.tan(radians); break;
                    }
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid operation! Try again.");
            }
        }
        sc.close();
    }
}
