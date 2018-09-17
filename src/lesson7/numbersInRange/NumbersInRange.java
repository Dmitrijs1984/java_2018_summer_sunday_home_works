package lesson7.numbersInRange;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NumbersInRange {
    int[] arrayNumbers = new int[10];
    Set<Integer> rangeArrayNumbers = new HashSet<>();

    int firstRangeNumber;
    int secondRangeNumber;

    Random randomGenerator = new Random();

    void setArrayNumbers() {
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = randomGenerator.nextInt(101);
        }
    }

    void userInputRangeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please first range number:");
        firstRangeNumber = scanner.nextInt();
        System.out.println("Please second range number:");
        secondRangeNumber = scanner.nextInt();
    }

    void allNumbersInRange() {
        for (int j = 0; j < arrayNumbers.length; j++) {
            if (arrayNumbers[j] < secondRangeNumber && arrayNumbers[j] > firstRangeNumber) {
                rangeArrayNumbers.add(arrayNumbers[j]);
            }
        }
    }

    void printArrayNumbrers(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    void printRangeArrayNumbers() {
        System.out.println(rangeArrayNumbers);
    }
}

