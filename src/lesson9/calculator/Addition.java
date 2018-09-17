package lesson9.calculator;

public class Addition implements CalculatorInterface {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
