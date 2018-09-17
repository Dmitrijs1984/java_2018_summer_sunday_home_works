package lesson7.arrayNumbersSum;

import lesson7.arrayNumbersSum.SumOfArrayNumbers;

public class SumOfArrayNumbersDemo {
    public static void main(String[] args) {
        SumOfArrayNumbers sumOfArrayNumbers = new SumOfArrayNumbers();
        sumOfArrayNumbers.setArrayNumbers();
        sumOfArrayNumbers.printArrayNumbrers(sumOfArrayNumbers.numbersArray);
    }
}
