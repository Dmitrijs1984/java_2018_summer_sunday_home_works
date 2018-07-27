package lesson5.smartWallet;

public class SmartWallet {

    int correctPin = 123;
    int amount = 0;
    boolean userAccept = false;

    void createSmartWallet(int correctPin, int amount) {
        this.correctPin = correctPin;
        this.amount = amount;
    }

    boolean addMoneyWallet(int pin, int addMoney) {
        if (pin == correctPin) {
            amount = amount + addMoney;
            userAccept = true;
        } else {
            userAccept = false;
        }
        return userAccept;
    }

    boolean redraw(int pin, int getMoney) {
        if ((pin == correctPin) && (amount - getMoney >= 0)) {
            amount = amount - getMoney;
            userAccept = true;
        } else {
            userAccept = false;
        }
        return userAccept;
    }

    int balance(int pin) {
        if (pin == correctPin) {
            userAccept=true;
            return amount;
        } else userAccept = false;

        return 0;
    }
}
