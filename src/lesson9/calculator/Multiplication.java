package lesson9.calculator;

public class Multiplication implements CalculatorInterface {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
