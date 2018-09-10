package gravitrips;

public class PlayerOrComputerMoveMaking {

    Gravitrips gravitrips = new Gravitrips();
    GameBoard gameBoard = new GameBoard();
    CheckPlayerToWin checkPlayerToWin = new CheckPlayerToWin();

    void playerVsPlayer() {
        while (checkPlayerToWin.playerWinGame == false) {
            gameBoard.playerMove();
            gameBoard.printGameBoard();
            gravitrips.floorRowDisappears(gameBoard.gameTable,gameBoard.columnElementsCounter);
            checkPlayerToWin.checkToWin(gameBoard.gameTable);
            gameBoard.changeUsersSymbols();
        }
    }

    void playerVsComputer() {
        while (checkPlayerToWin.playerWinGame == false) {
            gravitrips.floorRowDisappears(gameBoard.gameTable,gameBoard.columnElementsCounter);
            gameBoard.playerMove();
            gameBoard.printGameBoard();
            checkPlayerToWin.checkToWin(gameBoard.gameTable);
            gameBoard.changeUsersSymbols();
            if (checkPlayerToWin.playerWinGame == false) {
                gravitrips.floorRowDisappears(gameBoard.gameTable,gameBoard.columnElementsCounter);
                gameBoard.computerMove();
                gameBoard.printGameBoard();
                checkPlayerToWin.checkToWin(gameBoard.gameTable);
                gameBoard.changeUsersSymbols();
            }
        }
    }
}
