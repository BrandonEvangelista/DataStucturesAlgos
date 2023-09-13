package src;

/**
 * Represents a product with various attributes commonly found in e-commerce platforms.
 *
 * @author Mohammed Asgar
 * @author Brandon Evangelista
 * @author Manuel Herrera
 */
public class Product {
    int productID;
    String productName;
    float productRating;
    double price;

    /**
     * Constructs a new Product object.
     *
     * @param productID    The unique identifier for this product.
     * @param productName  The name of this product.
     * @param productRating The rating of this product.
     * @param price        The price of this product.
     */
    public Product(int productID, String productName, float productRating, double price) {
        this.productID = productID;
        this.productName = productName;
        this.productRating = productRating;
        this.price = price;
    }
//------------------------------------------------------------------------------------------- 
//------------------------------------------------------------------------------------------- 
//------------------------------------------------------------------------------------------- 
//------------------------------------------------------------------------------------------- 
//-------------------------------------------------------------------------------------------   
// Method to generate an array of X products with the same name but random prices
    public static Product[] generateProducts(int numberOfProducts, String productName) {
        if (numberOfProducts <= 0) {
            return null; // Handle invalid input
        }

        Product[] products = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            // Generate random price within a range (e.g., 10.0 to 100.0)
            double randomPrice = 10.0 + Math.random() * 90.0;
            float randomFloat = (float) (1.0 + Math.random() * 4.0);
            float roundedFloat = Math.round(randomFloat * 10.0f) / 10.0f;
            double roundPrice = Math.round(randomPrice );
            products[i] = new Product(i + 1, productName, roundedFloat, roundPrice);
        }

        return products;
    }
    
    //***************************************************************
    // Method to print the entire list of products
    public static void printProductList(Product[] products) {
        if (products == null || products.length == 0) {
            System.out.println("No products to display.");
            return;
        }

        for (Product product : products) {
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Product Rating: " + product.productRating);
            System.out.println("Product Price: $" + product.price);
            System.out.println(); 
        }
    }
 //------------------------------------------------------------------------------------------- 
 //------------------------------------------------------------------------------------------- 
 //-------------------------------------------------------------------------------------------   
//-------------------------------------------------------------------------------------
}
