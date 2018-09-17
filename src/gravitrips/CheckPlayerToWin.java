package gravitrips;

public class CheckPlayerToWin {

    boolean playerWinGame = false;

    void checkToWin(String[][] gameTable) {
        for (int i = 0; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j].equals(gameTable[i][j + 1]) && gameTable[i][j].equals(gameTable[i][j + 2]) && gameTable[i][j].equals(gameTable[i][j + 3]) && !gameTable[i][j].equals(".")) {
                    playerWinGame = true;
                    System.out.println("win1 po linii");
                }
            }
        }
        for (int i = 0; i < gameTable.length - 3; i++) {
            for (int j = 0; j < gameTable[i].length; j++) {
                if (gameTable[i][j].equals(gameTable[i + 1][j]) && gameTable[i][j].equals(gameTable[i + 2][j]) && gameTable[i][j].equals(gameTable[i + 3][j]) && !gameTable[i][j].equals(".")) {
                    playerWinGame = true;
                    System.out.println("win2 kolonna");
                }
            }
        }
        for (int i = 0; i < gameTable.length - 3; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j].equals(gameTable[i + 1][j + 1]) && gameTable[i][j].equals(gameTable[i + 2][j + 2]) && gameTable[i][j].equals(gameTable[i + 3][j + 3]) && !gameTable[i][j].equals(".")) {
                    playerWinGame = true;
                    System.out.println("win3 diagonal ubivaet");
                }
            }
        }
        for (int i = 3; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable[i].length - 3; j++) {
                if (gameTable[i][j].equals(gameTable[i - 1][j + 1]) && gameTable[i][j].equals(gameTable[i - 2][j + 2]) && gameTable[i][j].equals(gameTable[i - 3][j + 3]) && !gameTable[i][j].equals(".")) {
                    playerWinGame = true;
                    System.out.println("win4 diagonal vozrastaet");
                }
            }
        }
    }

}
