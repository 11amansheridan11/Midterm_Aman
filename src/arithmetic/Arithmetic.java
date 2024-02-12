package arithmetic;

import java.util.Scanner;

// Enum for arithmetic operations
enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 */
public class Arithmetic {

    public static void main(String[] args) {

        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double n = in.nextDouble();
        double m = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        Operation operation = Operation.valueOf(in.next().toUpperCase());

        double result = r.calculate(n, m, operation);
        System.out.println("result: " + result);
    }
}
