package src;
import src.ProductSorter;

/**
 * Entry point for the Product Sorter application. This class contains the main method to
 * demonstrate the functionality of sorting Product objects.
 *
 * @author Mohammed Asgar
 * @author Brandon Evangelista
 * @author Manuel Herrera
 */
public class Main {
    public static void main(String[] args) {

        // Create an array of Product objects for demonstration
        Product[] products = {
                new Product(1, "Laptop", 4.5f, 700.00),
                new Product(2, "Phone", 3.8f, 300.00),
                new Product(3, "TV", 4.7f, 400.00),
                new Product(4, "Camera", 3.9f, 500.00),
                new Product(5, "Headphones", 4.2f, 50.00),
        };
        
      //*****************************************************************************  
      //*****************************************************************************
        Product[] array10 = Product.generateProducts(100,"TV"); 
        Product[] array100 = Product.generateProducts(100,"TV");
        Product[] array1000 = Product.generateProducts(100,"TV");
       
        
        //uncomment to test 
        System.out.println("Sorting by Price: (lowest)");
        ProductSorter.sortAndDisplay(array10, "Price");
       // ProductSorter.sortAndDisplay(array100, "Price");
        //ProductSorter.sortAndDisplay(array1000, "Price");
      //***************************************************************************** 
      //*****************************************************************************
        
        System.out.println("Sorting by Name: (alphabetical)");
        ProductSorter.sortAndDisplay(products, "Name");
        System.out.println();

        System.out.println("Sorting by Rating: (highest)");
        ProductSorter.sortAndDisplay(products, "Rating");
        System.out.println();

        System.out.println("Sorting by Price: (lowest)");
        ProductSorter.sortAndDisplay(products, "Price");
    }
	
}
