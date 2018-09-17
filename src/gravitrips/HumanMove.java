package gravitrips;

import java.util.Scanner;

public class HumanMove extends Player {
    @Override
    void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column number:");
        int userChoiseColumn = scanner.nextInt();

        //proverku na valid
        GameBoard gameBoard = new GameBoard();

        gameBoard.columnElementsCounter[userChoiseColumn - 1]++;
   //     gameBoard.gameTable[gameBoard.gameTable.length - gameBoard.columnElementsCounter[userChoiseColumn - 1]][userChoiseColumn - 1] = actualUserSymbol;

    }
}
