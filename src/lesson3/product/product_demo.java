package lesson3.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class product_demo {
    public static void main(String[] args) {

        String name = "milk";
        float regularPrice = 0.80f;
        int discount = 20;

        lesson3.product.Product firstProduct = new lesson3.product.Product(name, regularPrice, discount);

        lesson3.product.Product secondProduct = new lesson3.product.Product("Pienas", 1.23f, 50);

        float firstProductActualPrice = firstProduct.getActualPrice(firstProduct.regularPrice, firstProduct.discount);
        float secondProductActualPrice = secondProduct.getActualPrice(secondProduct.regularPrice, secondProduct.discount);

        BigDecimal changedNumber = new BigDecimal(firstProductActualPrice);
        changedNumber =changedNumber.setScale(2,RoundingMode.HALF_UP);

        System.out.println("firstProductActualPrice ==> " + firstProductActualPrice);
        System.out.println("secondProductActualPrice ==> " + secondProductActualPrice);
        System.out.println(changedNumber);
    }
}
