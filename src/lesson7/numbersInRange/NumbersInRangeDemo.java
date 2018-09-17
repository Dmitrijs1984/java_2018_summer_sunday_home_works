package lesson7.numbersInRange;

public class NumbersInRangeDemo {
    public static void main(String[] args) {
        NumbersInRange numbersInRange=new NumbersInRange();
        numbersInRange.setArrayNumbers();
        numbersInRange.printArrayNumbrers(numbersInRange.arrayNumbers);
        numbersInRange.userInputRangeNumbers();
        numbersInRange.allNumbersInRange();
        numbersInRange.printRangeArrayNumbers();
    }
}
