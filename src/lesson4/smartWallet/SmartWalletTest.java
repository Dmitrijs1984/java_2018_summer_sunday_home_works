package lesson4.smartWallet;

public class SmartWalletTest {
    int correctPin = 123;
    int amount = 0;
    boolean xxx = false;

    void createSmartWallet(int correctPin, int amount) {
        this.correctPin = correctPin;
        this.amount = amount;
    }

    boolean addMoneyWallet(int pin, int addMoney) {
        if (pin == correctPin) {
            amount = addMoney + amount;
            xxx = true;
        } else {
            xxx = false;
        }
        return xxx;
    }

    boolean redraw(int pin, int getMoney) {
        if ((pin == correctPin) && (amount - getMoney >= 0)) {
            amount = amount - getMoney;
            xxx = true;
        } else {
            xxx = false;
        }
        return xxx;
    }

    int balance(int pin) {
        if (pin == correctPin) {
            return amount;
          //  xxx = true;
        } else xxx = false;

        return 0;
    }
}

//boolean redraw
//int balance (pin)

