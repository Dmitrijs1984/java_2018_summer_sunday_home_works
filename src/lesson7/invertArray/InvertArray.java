package lesson7.invertArray;

import java.util.Random;

public class InvertArray {
    int[] numbersArray = new int[10];
    int auxiliaryNumber;

    Random randomGenerator = new Random();

    void setArrayNumbers() {
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = randomGenerator.nextInt(101);
        }
    }

    void invertArray() {
        for (int i = 0; i < numbersArray.length / 2; i++) {
            auxiliaryNumber = numbersArray[i];
            numbersArray[i] = numbersArray[numbersArray.length - 1 - i];
            numbersArray[numbersArray.length - 1 - i] = auxiliaryNumber;
        }
    }

    void printArrayNumbrers(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
