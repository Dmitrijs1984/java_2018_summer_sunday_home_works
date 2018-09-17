package lesson9.calculator;

public class Division implements CalculatorInterface {
    @Override
    public int execute(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
    }
}