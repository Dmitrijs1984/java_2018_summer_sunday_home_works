package lesson7.arrayNumbersSum;

import java.util.Random;

public class SumOfArrayNumbers {
    int[] numbersArray = new int[10];
    int sumNumbers = 0;

    Random randomGenerator = new Random();

    void setArrayNumbers() {
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = randomGenerator.nextInt(5);
            sumNumbers += numbersArray[i];
        }
    }

    void printArrayNumbrers(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sum of numbers:" + sumNumbers);

    }

}