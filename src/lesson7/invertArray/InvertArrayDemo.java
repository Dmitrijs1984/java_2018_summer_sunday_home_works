package lesson7.invertArray;

public class InvertArrayDemo {
    public static void main(String[] args) {

        InvertArray invertArray = new InvertArray();
        invertArray.setArrayNumbers();
        invertArray.printArrayNumbrers(invertArray.numbersArray);
        invertArray.invertArray();
        invertArray.printArrayNumbrers(invertArray.numbersArray);
    }
}
