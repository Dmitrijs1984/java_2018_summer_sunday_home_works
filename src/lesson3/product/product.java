package lesson3.product;

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
        System.out.println(1 - (float) discount / 100);
        return actualPrice;
    }

}
