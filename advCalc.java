import java.util.Scanner;

public class advCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;

        while (go) {
            // Main Menu
            System.out.println("Select an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square Root");
            System.out.println("6: Square");
            System.out.println("7: Sine");
            System.out.println("8: Cosine");
            System.out.println("9: Tangent");
            System.out.println("10: Natural Logarithm");
            System.out.println("11: Exponential e^x");
            System.out.println("12: Exit");
            System.out.print("Enter your choice: ");
            
            // I'm having to relearn these math functions. I forgot everything.

            int choice = getValidInteger(scanner);

            // Switch and case makes this way easier to read than using a bunch of if statements
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double add1 = getValidDouble(scanner);
                    System.out.print("Enter second number: ");
                    double add2 = getValidDouble(scanner);
                    System.out.println("Result: " + (add1 + add2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double sub1 = getValidDouble(scanner);
                    System.out.print("Enter second number: ");
                    double sub2 = getValidDouble(scanner);
                    System.out.println("Result: " + (sub1 - sub2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double mul1 = getValidDouble(scanner);
                    System.out.print("Enter second number: ");
                    double mul2 = getValidDouble(scanner);
                    System.out.println("Result: " + (mul1 * mul2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double div1 = getValidDouble(scanner);
                    System.out.print("Enter second number: ");
                    double div2 = getValidDouble(scanner);
                    if (div2 != 0) {
                        System.out.println("Result: " + (div1 / div2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    double sqrtNum = getValidDouble(scanner);
                    if (sqrtNum >= 0) {
                        System.out.println("Result: " + Math.sqrt(sqrtNum));
                    } else {
                        System.out.println("Error: Cannot take the square root of a negative number.");
                    }
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    double squareNum = getValidDouble(scanner);
                    System.out.println("Result: " + (squareNum * squareNum));
                    break;
                case 7:
                    System.out.print("Enter an angle in degrees: ");
                    double sinNum = getValidDouble(scanner);
                    System.out.println("Result: " + Math.sin(Math.toRadians(sinNum)));
                    break;
                case 8:
                    System.out.print("Enter an angle in degrees: ");
                    double cosNum = getValidDouble(scanner);
                    System.out.println("Result: " + Math.cos(Math.toRadians(cosNum)));
                    break;
                case 9:
                    System.out.print("Enter an angle in degrees: ");
                    double tanNum = getValidDouble(scanner);
                    System.out.println("Result: " + Math.tan(Math.toRadians(tanNum)));
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    double logNum = getValidDouble(scanner);
                    if (logNum > 0) {
                        System.out.println("Result: " + Math.log(logNum));
                    } else {
                        System.out.println("Error: Cannot take the natural logarithm of zero or a negative number");
                    }
                    break;
                case 11:
                    System.out.print("Enter a number: ");
                    double expNum = getValidDouble(scanner);
                    System.out.println("Result: " + Math.exp(expNum));
                    break;
                case 12:
                    go = false;
                    System.out.println("Bye bye forever! Adios indefinitely!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    // Method to make sure the user inputs a valid double
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.next(); // Get rid of the invalid input
        }
        return scanner.nextDouble();
    }

    // Method to make sure the user inputs a valid integer
    private static int getValidInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next(); // Get rid of the invalid input
        }
        return scanner.nextInt();
    }
}
