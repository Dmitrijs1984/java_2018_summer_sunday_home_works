package lesson3.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Product {
    String name;
    float regularPrice;
    int discount;

    public Product(String newName, float newRegularPrice, int newDiscount) {
        name = newName;
        regularPrice = newRegularPrice;
        discount = newDiscount;
    }

    public String getName() {
        return name;
    }

    public float getRegularPrice() {
        return regularPrice;
    }

    public int getDiscount() {
        return discount;
    }

    float getActualPrice(float regularPrice, int discount) {
        float actualPrice = regularPrice * (1 - (float) discount / 100);
        return actualPrice;
    }
    void changeNumberType(float number){
        BigDecimal changedNumber = new BigDecimal(number);
        changedNumber =changedNumber.setScale(2,RoundingMode.HALF_UP);
        System.out.println(changedNumber);
    }

}
