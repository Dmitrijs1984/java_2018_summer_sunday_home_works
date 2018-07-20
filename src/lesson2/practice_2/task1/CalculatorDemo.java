package lesson2.practice_2.task1;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumResult = calc.sum(13, 12);
        System.out.println(sumResult);

        int substractResult = calc.subtract(13, 12);
        System.out.println(substractResult);

        int multiplyResult = calc.multiply(13, 12);
        System.out.println(multiplyResult);

        double divideResult = calc.divide(13, 4);
        System.out.println(divideResult);
    }
}
