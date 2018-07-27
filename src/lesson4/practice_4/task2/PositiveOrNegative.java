package lesson4.practice_4.task2;

class PositiveOrNegative {

    /**
     * Тема: Условия (операторы if/else)
     * <p>
     * Задание 2: Необходимо дополнить метод getPositiveOrNegative() таким образом,
     * чтобы в качестве результата возвращалась строка "Positive" если число положительное, "Negative"
     * если число отрицательное, "Zero" если число 0.
     */

    String getPositiveOrNegative(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return ("Negative");
        } else {
            return "Zero";
        }

    }
}
