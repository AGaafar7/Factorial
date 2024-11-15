// FactorialCalculator.java
public class FactorialCalculator {
    private int number;

    public FactorialCalculator() {

    }

    public FactorialCalculator(int number) {
        this.number = number;
    }


    // Method to calculate factorial
    public long calculateFactorial() {
        long factorial = 1;
        for (int i = 1; i <= this.number; i++) {
            factorial *= i;
        }
        return factorial;
    }




    public long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {

        FactorialCalculator calculator = new FactorialCalculator();


        int number = 5;
            long result = calculator.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
    }
}
