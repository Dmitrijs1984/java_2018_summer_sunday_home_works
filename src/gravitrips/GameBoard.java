package gravitrips;

import java.util.Random;
import java.util.Scanner;

public class GameBoard {

    String firstUserSymbol = "X";
    String secondUserSymbol = "O";
    String actualUserSymbol = firstUserSymbol;

    int[] columnElementsCounter = new int[7];
    String[][] gameTable = new String[6][7];

    void printGameBoard() {
        for (int k = 0; k < columnElementsCounter.length; k++) {
            System.out.print(columnElementsCounter[k]);
        }
        System.out.println();
        System.out.println("1  2  3  4  5  6  7");
        for (int i = 0; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length; j++) {
                if (gameTable[i][j] != ("X") && gameTable[i][j] != ("O")) {
                    gameTable[i][j] = ".";
                }
                System.out.print(gameTable[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void changeUsersSymbols() {
        if (actualUserSymbol == firstUserSymbol) {
            actualUserSymbol = secondUserSymbol;
        } else if (actualUserSymbol == secondUserSymbol) {
            actualUserSymbol = firstUserSymbol;
        }
    }

    void playerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column number:");
        int userChoiseColumn = scanner.nextInt();
        columnElementsCounter[userChoiseColumn - 1]++;
        gameTable[gameTable.length - columnElementsCounter[userChoiseColumn - 1]][userChoiseColumn - 1] = actualUserSymbol;
    }

    void computerMove() {
        Random random = new Random();
        int randomRangeNumber = random.nextInt(7);
        columnElementsCounter[randomRangeNumber]++;
        gameTable[gameTable.length - columnElementsCounter[randomRangeNumber]][randomRangeNumber] = actualUserSymbol;
    }

}
