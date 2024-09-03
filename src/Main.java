public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long maxNumber = 45;
        fibonacci.generateFibonacci(maxNumber);
        fibonacci.displayFibonacci(maxNumber, "The " + maxNumber + " sequence fibonacci: ");
    }
}
