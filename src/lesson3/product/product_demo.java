package lesson3.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class product_demo {
    public static void main(String[] args) {

        String name = "milk";
        float regularPrice = 0.80f;
        int discount = 20;

        Product firstProduct = new Product(name, regularPrice, discount);

        Product secondProduct = new Product("Pienas", 1.23f, 50);

        float firstProductActualPrice = firstProduct.getActualPrice(firstProduct.regularPrice, firstProduct.discount);
        float secondProductActualPrice = secondProduct.getActualPrice(secondProduct.regularPrice, secondProduct.discount);

        System.out.print("firstProductActualPrice ==> ");
        firstProduct.changeNumberType(firstProductActualPrice);
        System.out.print("secondProductActualPrice ==> ");
        secondProduct.changeNumberType(secondProductActualPrice);
    }
}
