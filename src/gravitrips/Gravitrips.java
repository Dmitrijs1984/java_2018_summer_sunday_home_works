package gravitrips;

import java.util.Random;
import java.util.Scanner;

public class Gravitrips {
    boolean playerWinGame = false;
    boolean validMove = false;

    String firstUserSymbol = "X";
    String secondUserSymbol = "O";
    String actualUserSymbol = firstUserSymbol;

    int[] columnElementsCounter = new int[7];
    String[][] gameTable = new String[6][7];

    void printGameTable() {
        for (int k = 0; k < columnElementsCounter.length; k++) {
            System.out.print(columnElementsCounter[k]);
        }
        System.out.println();
        System.out.println("1  2  3  4  5  6  7");
        for (int i = 0; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length; j++) {
                if (gameTable[i][j] != "X" && gameTable[i][j] != "O") {
                    gameTable[i][j] = ".";
                }
                System.out.print(gameTable[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void playerMove() {
        Scanner scanner = new Scanner(System.in);

        //     while (validMove == false) {
        System.out.println("Enter column number:");
        int userChoiseColumn = scanner.nextInt();
        //         playerValidMoveCheck();

        //         if (validMove == true) {
        columnElementsCounter[userChoiseColumn - 1]++;
        gameTable[gameTable.length - columnElementsCounter[userChoiseColumn - 1]][userChoiseColumn - 1] = actualUserSymbol;
    }
    //      }
    //  }


    void computerMove() {
        Random random = new Random();
        int randomRangeNumber = random.nextInt(7);
        columnElementsCounter[randomRangeNumber]++;
        gameTable[gameTable.length - columnElementsCounter[randomRangeNumber]][randomRangeNumber] = actualUserSymbol;
    }

    void changeUsersSymbols() {
        if (actualUserSymbol == firstUserSymbol) {
            actualUserSymbol = secondUserSymbol;
        } else if (actualUserSymbol == secondUserSymbol) {
            actualUserSymbol = firstUserSymbol;
        }
    }

    void checkUserToWin() {
        for (int i = 0; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j] == gameTable[i][j + 1] && gameTable[i][j] == gameTable[i][j + 2] && gameTable[i][j] == gameTable[i][j + 3] && gameTable[i][j] != ".") {
                    playerWinGame = true;
                    System.out.println("win1 po linii");
                }
            }
        }
        for (int i = 0; i < gameTable.length - 3; i++) {
            for (int j = 0; j < gameTable[i].length; j++) {
                if (gameTable[i][j] == gameTable[i + 1][j] && gameTable[i][j] == gameTable[i + 2][j] && gameTable[i][j] == gameTable[i + 3][j] && gameTable[i][j] != ".") {
                    playerWinGame = true;
                    System.out.println("win2 kolonna");
                }
            }
        }
        for (int i = 0; i < gameTable.length - 3; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j] == gameTable[i + 1][j + 1] && gameTable[i][j] == gameTable[i + 2][j + 2] && gameTable[i][j] == gameTable[i + 3][j + 3] && gameTable[i][j] != ".") {
                    playerWinGame = true;
                    System.out.println("win3 diagonal ubivaet");
                }
            }
        }
        for (int i = 3; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j] == gameTable[i - 1][j + 1] && gameTable[i][j] == gameTable[i - 2][j + 2] && gameTable[i][j] == gameTable[i - 3][j + 3] && gameTable[i][j] != ".") {
                    playerWinGame = true;
                    System.out.println("win4 diagonal vozrastaet");
                }
            }
        }
    }

    void gameType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Player VS Player ");
        System.out.println("2. Player VS Computer ");
        int playerGameTypeChoise = scanner.nextInt();
        if (playerGameTypeChoise == 1) {
            playerVsPlayer();
        } else if (playerGameTypeChoise == 2) {
            playerVsComputer();
        }
    }

    void playerVsPlayer() {
        while (playerWinGame == false) {
            playerMove();
            printGameTable();
            floorRowDisappears();
            checkUserToWin();
            changeUsersSymbols();
        }
    }

    void playerVsComputer() {
        while (playerWinGame == false) {
            floorRowDisappears();
            playerMove(); // computerMove();
            printGameTable();
            checkUserToWin();
            changeUsersSymbols();
            if (playerWinGame == false) {
                floorRowDisappears();
                computerMove();
                printGameTable();
                checkUserToWin();
                changeUsersSymbols();
            }
        }
    }

    void floorRowDisappears() {
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


    void playerValidMoveCheck() {
        // valid na cislo
        // valid na counter
        for (int i = 0; i < gameTable.length; i++) {
            //System.out.println(gameTable.length);
            // System.out.println(gameTable[i].length);
            if (columnElementsCounter[i] < gameTable.length) {
                validMove = true;
            } else {
                System.out.println("not valid move");
            }
        }
    }
}