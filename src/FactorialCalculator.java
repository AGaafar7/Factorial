// FactorialCalculator.java
public class FactorialCalculator {

    // Method to calculate factorial
    public long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static void main(String[] args) {

        FactorialCalculator calculator = new FactorialCalculator();


        int number = 5;
            long result = calculator.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
    }
}
