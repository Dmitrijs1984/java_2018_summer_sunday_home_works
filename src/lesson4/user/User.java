package lesson4.user;

import java.util.Scanner;

public class User {

    private String nickname;
    private String password;
    private String correctPassword = "qw";
    private int loginAttemptsLeft = 3;
    private boolean blocked = true;

    private String userEnterNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter nickname:");
        String userNickname = scanner.nextLine();
        return userNickname;
    }

    private String userEnterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password:");
        String userPassword = scanner.nextLine();
        password = userPassword;
        return userPassword;
    }

    public boolean verifyPassword() {
        while (blocked == true && loginAttemptsLeft > 0) {
            String un = userEnterNickname();
            String up = userEnterPassword();

            if (correctPassword.equals(password) && loginAttemptsLeft > 0) {
                loginAttemptsLeft = 3;
                blocked = false;
                System.out.println("Correct passwords. Loading. Please wait...");
            } else if (password != correctPassword && loginAttemptsLeft > 0) {
                loginAttemptsLeft = loginAttemptsLeft - 1;
                blocked = true;
                System.out.println("Wrong password. " + loginAttemptsLeft + " attempts left");
                if (loginAttemptsLeft == 0) {
                    System.out.println("User is blocked.");
                }
            }
        }
        return blocked;


        // private void toStringg () {
    }
}





