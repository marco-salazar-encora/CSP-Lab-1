/**
 * The Calculator class provides methods to perform basic arithmetic operations.
 */
public class Calculator {
    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The difference between the two numbers.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of the two numbers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two numbers.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of the division.
     * @throws IllegalArgumentException if the divisor is zero.
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}