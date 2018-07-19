package lesson3.product;

import lesson3.product.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class product_demo {
    public static void main(String[] args) {

        String name = "milk";
        float regularPrice = 0.80f;
        int discount = 20;

        Product firstProduct = new Product(name, regularPrice, discount);

        Product secondProduct = new Product("Pienas", 1, 50);

        float firstProductActualPrice = firstProduct.getActualPrice(firstProduct.regularPrice, firstProduct.discount);
        float secondProductActualPrice = secondProduct.getActualPrice(secondProduct.regularPrice, secondProduct.discount);

        BigDecimal bd = new BigDecimal(firstProductActualPrice);
        bd =bd.setScale(2,RoundingMode.HALF_UP);

        System.out.println("firstProductActualPrice ==> " + firstProductActualPrice);
        System.out.println("secondProductActualPrice ==> " + secondProductActualPrice);
        System.out.println(bd);
    }
}