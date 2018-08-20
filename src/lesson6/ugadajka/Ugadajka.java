package lesson6.ugadajka;

import java.util.Scanner;

public class Ugadajka {
    int rangeMiddleNumber;
    int from;
    int to;

    public int computerRangeMiddleNumber(int from, int to) {
        this.from = from;
        this.to = to;
        rangeMiddleNumber = (to - from) / 2 + from;
        return rangeMiddleNumber;
    }

    void choiseListForUser() {
        System.out.println("Your number is : " + rangeMiddleNumber + " ?");
        System.out.println("press '1' if your number is less than " + rangeMiddleNumber);
        System.out.println("press '2' if your number is equal to " + rangeMiddleNumber);
        System.out.println("press '3' if your number is more than " + rangeMiddleNumber);
        userAnswer();
    }

    Scanner scanner = new Scanner(System.in);

    boolean less = false;
    boolean equal = false;
    boolean more = false;

    public void userAnswer() {
        String userAnswerInput = scanner.nextLine();
        if (userAnswerInput.equals("1")) {
            less = true;
            computerRangeMiddleNumber(from, rangeMiddleNumber);
        }
        if (userAnswerInput.equals("2")) {
            equal = true;
        }
        if (userAnswerInput.equals("3")) {
            more = true;
            computerRangeMiddleNumber(rangeMiddleNumber, to);
        }

    }
}

