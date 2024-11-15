public class Main {
    public static void main(String[] args) {

        FactorialCalculator calculator = new FactorialCalculator();
        FactorialCalculator calculatorTwo = new FactorialCalculator(5);
        FactorialCalculator calculatorSetterGetter = new FactorialCalculator();

        calculatorSetterGetter.setNumber(10);
        System.out.println(calculatorSetterGetter.getNumber());

        int number = 5;
        long result = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        long results = calculatorTwo.calculateFactorial();
        System.out.println("Factorial of " + number + " is: " + results);

    }
}
