package lesson3.product;

import lesson3.product.Product;

public class product_demo {
    public static void main(String[] args) {

        String name = "milk";
        float regularPrice = 0.80f;
        int discount = 20;

        Product firstProduct = new Product(name, regularPrice, discount);

        Product secondProduct = new Product("Pienas", 1, 50);

        float firstProductActualPrice = firstProduct.getActualPrice(firstProduct.regularPrice, firstProduct.discount);
        float secondProductActualPrice = secondProduct.getActualPrice(secondProduct.regularPrice, secondProduct.discount);

        System.out.println("firstProductActualPrice ==> " + firstProductActualPrice);
        System.out.println("secondProductActualPrice ==> " + secondProductActualPrice);
    }
}