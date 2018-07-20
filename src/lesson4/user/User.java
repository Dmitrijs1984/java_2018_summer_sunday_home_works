package lesson4.user;

public class User {

    private String nickname;
    private String password;
    private int loginAttemptsLeft = 3;
    private boolean blocked;

    public boolean verifyPassword(String password) {
        String correctPassword = "q";
        boolean passwordIsCorrect = false;


            if (password == correctPassword && loginAttemptsLeft > 0) {
                loginAttemptsLeft = 3;
                passwordIsCorrect = true;
                System.out.println("Correct passwords. Loading. Please wait...");
            } else if (password != correctPassword && loginAttemptsLeft > 0) {
                loginAttemptsLeft = loginAttemptsLeft - 1;
                passwordIsCorrect = false;
                System.out.println("Wrong password. " + loginAttemptsLeft + " attempts left");
            }
            if (loginAttemptsLeft == 0) {
                System.out.println("User is blocked.");
            }

        return passwordIsCorrect;
    }

    private void toStringg() {
    }
}




