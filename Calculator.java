import java.util.Scanner;
class Calculator {
    // Addition
    double add(double a, double b) {
        return a + b;                                                     // 10
    }
    // Subtraction
    double subtract(double a, double b) {
        return a - b;                                                    //  0
    }
    // Multiplication
    double multiply(double a, double b) {
        return a * b;                                                   // 25
    }
    // Division
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");              //1
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice;
        do {
            // Input numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();                                    //5
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();                                   //5
            // Input operator
            System.out.print("Choose operation (+, -, *, /): ");        //   + or - or * or /
            char op = sc.next().charAt(0);
            double result = 0;
            boolean valid = true;
            // Performing operation
            switch (op) {
                case '+':
                    result = calc.add(num1, num2);
                    break;

                case '-':
                    result = calc.subtract(num1, num2);
                    break;

                case '*':
                    result = calc.multiply(num1, num2);
                    break;

                case '/':
                    result = calc.divide(num1, num2);
                    break;

                default:
                    System.out.println("Error: Invalid operator!");
                    valid = false;
            }
            // Print result only if valid
            if (valid && !(op == '/' && num2 == 0)) {
                System.out.println("Result: " + result);
            }
            // Asking user to continue
            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you for using the calculator!");
    }
}