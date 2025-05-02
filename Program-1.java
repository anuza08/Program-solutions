import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String op = sc.next();

        if (op.equals("add")) {
            System.out.println("Result: " + (a + b));
        } else if (op.equals("subtract")) {
            System.out.println("Result: " + (a - b));
        } else if (op.equals("multiply")) {
            System.out.println("Result: " + (a * b));
        } else if (op.equals("divide")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
    }
}
