package lesson4.user;

public class User {

    private String nickname;
    private String password;
    String correctPassword="q";
    private int loginAttemptsLeft = 3;
    private boolean blocked=true;

    public boolean verifyPassword(String password) {

            if (password == correctPassword && loginAttemptsLeft > 0) {
                loginAttemptsLeft = 3;
                blocked = false;
                System.out.println("Correct passwords. Loading. Please wait...");
            } else if (password != correctPassword && loginAttemptsLeft > 0) {
                loginAttemptsLeft = loginAttemptsLeft - 1;
                blocked = true;
                System.out.println("Wrong password. " + loginAttemptsLeft + " attempts left");
            }
            if (loginAttemptsLeft == 0) {
                System.out.println("User is blocked.");
            }

        return blocked;
    }

    private void toStringg() {
    }
}




