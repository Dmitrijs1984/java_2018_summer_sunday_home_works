package lesson3.stock;

public class StockDemo {
    public static void main(String[] args) {

        Stock companyStockInfo = new Stock("IBM", 146.54);
        companyStockInfo.updatePrice(146.50);
        companyStockInfo.updatePrice(146.56);
        companyStockInfo.updatePrice(120.30);
        companyStockInfo.toSting("IBM");
    }

}
