package lesson4.user;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {

        User userDataCheck = new User();
        boolean pasCheck = userDataCheck.verifyPassword();
        userDataCheck.toStringg();
    }
}
