package lesson6.ugadajka;

public class UgadajkaDemo {
    public static void main(String[] args) {

        Ugadajka ugadajka = new Ugadajka();

        ugadajka.computerRangeMiddleNumber(1, 100);

        while (ugadajka.equal == false) {
            ugadajka.choiseListForUser();
            if (ugadajka.from == ugadajka.to) {
                break;
            }
        }
    }
}
