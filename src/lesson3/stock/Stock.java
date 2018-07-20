package lesson3.stock;

import java.text.DecimalFormat;

public class Stock {
    String company;
    double currentValue;
    double max;
    double min;

    Stock(String newCompany, double newCurrentValue) {
        company = newCompany;
        currentValue = newCurrentValue;
        max = newCurrentValue;
        min = newCurrentValue;
    }

    public double updatePrice(double newCurrentValue) {
        currentValue = newCurrentValue;
        if (currentValue < min) min = currentValue;
        if (currentValue > max) max = currentValue;
        return currentValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    void newNumberFormat(double number) {
        DecimalFormat newFormat = new DecimalFormat(".00");
        System.out.println(newFormat.format(number));
    }

    void toSting(String company) {
        System.out.println("Company " + company);

        System.out.print("CurrentValue = ");
        newNumberFormat(currentValue);

        System.out.print("MaxValue = ");
        newNumberFormat(max);

        System.out.print("MinValue = ");
        newNumberFormat(min);
    }
}
