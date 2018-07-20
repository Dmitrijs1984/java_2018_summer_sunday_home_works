package lesson2.practice_2.task1;

class Calculator {

    /**
     * Тема: Математические операции
     */

    //TODO: Необходимо заполнить тело метода так, чтобы результатом работы была сумма первого и второго числа
    int sum(int firstNumber, int secondNumber) {
        int sumResult = firstNumber + secondNumber;
        return sumResult;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом была разность первого и второго числа
    int subtract(int firstNumber, int secondNumber) {
        int substractResult = firstNumber - secondNumber;
        return substractResult;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом было перемножение первого и второго числа
    int multiply(int firstNumber, int secondNumber) {
        int multiplyResult = firstNumber * secondNumber;
        return multiplyResult;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом было деление первого числа на второе (результатом может быть дробное число)
    double divide(int firstNumber, int secondNumber) {
        double divideResult = firstNumber / (double) secondNumber;
        return divideResult;
    }

}
