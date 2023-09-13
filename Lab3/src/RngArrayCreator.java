package src;
import java.util.Random;

public class RngArrayCreator{

    public static Product[] randomCreator(int numberOfProducts, String productName, double minPrice, double maxPrice) {
        if (numberOfProducts <= 0) {
            return null; // Handle invalid input
        }

        Product[] products = new Product[numberOfProducts];
        Random random = new Random();

        for (int i = 0; i < numberOfProducts; i++) {
            double randomPrice = minPrice + (maxPrice - minPrice) * random.nextDouble();
            Product product = new Product(i + 1, productName, 4.5f, randomPrice);
            products[i] = product;
        }

        return products;
    }

}  

