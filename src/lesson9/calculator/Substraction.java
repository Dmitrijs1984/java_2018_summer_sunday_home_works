package lesson9.calculator;

public class Substraction implements CalculatorInterface{
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}
