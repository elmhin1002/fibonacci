import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private final List<BigInteger> fibonacci = new ArrayList<>();

    public void displayFibonacci(long number, String message) {
        System.out.println(message);
        for (int i = 0; i < fibonacci.size(); i++) {
            System.out.print(fibonacci.get(i));
            if (i == fibonacci.size() - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }

    public void generateFibonacci(long number) {
        fibonacci.clear();
        generateFibonacciRecursive(number, BigInteger.ZERO, BigInteger.ONE);
    }

    private void generateFibonacciRecursive(long number, BigInteger current, BigInteger previous) {
        if (number > 0) {
            fibonacci.add(current);
            BigInteger next = current.add(previous);
            generateFibonacciRecursive(number - 1, next, current);
        }
    }
}
