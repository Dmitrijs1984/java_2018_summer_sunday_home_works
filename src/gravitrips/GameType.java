package gravitrips;

import java.util.Scanner;

public class GameType {
    void chooseGameType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Player VS Player ");
        System.out.println("2. Player VS Computer ");
        int playerGameTypeChoise = scanner.nextInt();
        PlayerOrComputerMoveMaking playerOrComputerMoveMaking = new PlayerOrComputerMoveMaking();
        if (playerGameTypeChoise == 1) {
            playerOrComputerMoveMaking.playerVsPlayer();
        } else if (playerGameTypeChoise == 2) {
            playerOrComputerMoveMaking.playerVsComputer();
        }
    }

}
