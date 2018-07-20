package lesson2.practice_2.task2;

class DiscriminantCalculator {

    /**
     * Тема: Математические операции
     * <p>
     * Задание 2: Необходимо дополнить метод таким образом, чтобы результатом было вычисление дискриминанта
     */
    int calculate(int a, int b, int c) {
        int discriminantResult = b * b - 4 * a * c;
        return discriminantResult;
    }

}
