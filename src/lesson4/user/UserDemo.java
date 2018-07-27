package lesson4.user;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter nickname:");
        String userNickname = scanner.next();

        System.out.println("Please enter password:");
        String userPassword = scanner.next();

        User userDataCheck = new User();
        boolean pasCheck = userDataCheck.verifyPassword(userPassword);

    }
}
