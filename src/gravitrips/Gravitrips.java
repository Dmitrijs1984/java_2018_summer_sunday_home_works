package gravitrips;

import java.util.Random;
import java.util.Scanner;

public class Gravitrips {
    boolean validMove = false;

    void floorRowDisappears(String gameTable[][], int[] columnElementsCounter) {
        int fullFloorRowCounter = 0;
        for (int k = 0; k < columnElementsCounter.length; k++) {
            if (columnElementsCounter[k] > 0) {
                fullFloorRowCounter++;
            }
            if (fullFloorRowCounter == columnElementsCounter.length) {
                for (int i = 0; i < gameTable.length - 1; i++) {
                    for (int j = 0; j < gameTable[i].length; j++) {
                        gameTable[gameTable.length - columnElementsCounter[j]][j] = gameTable[gameTable.length - columnElementsCounter[j] - 1][j];
                    }
                }
                for (int c = 0; c < columnElementsCounter.length; c++) {
                    columnElementsCounter[c]--;
                }
            }

        }
    }

    GameBoard gameBoard = new GameBoard();

    void playerValidMoveCheck() {
        // valid na cislo
        // valid na counter
        for (int i = 0; i < gameBoard.gameTable.length; i++) {
            //System.out.println(gameTable.length);
            // System.out.println(gameTable[i].length);
            if (gameBoard.columnElementsCounter[i] < gameBoard.gameTable.length) {
                validMove = true;
            } else {
                System.out.println("not valid move");
            }
        }
    }
}