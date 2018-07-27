package lesson4.practice_4.task1;

class MaxOfTwo {

    /**
     * Тема: Условия (операторы if/else)
     * <p>
     * Задание 1: Необходимо дополнить метод getMaxOfTwo() таким образом, чтобы результатом работы
     * метода было наибольшее число из двух
     */

    int getMaxOfTwo(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
