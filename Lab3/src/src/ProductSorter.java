package src;
/**
 * Contains utility methods for sorting an array of Product objects.
 *
 * @author Mohammed Asgar
 * @author Brandon Evangelista
 * @author Manuel Herrera
 */
public class ProductSorter {

    /**
     * Performs quick sort on an array of Product objects.
     *
     * @param arr       The array to be sorted.
     * @param low       The starting index for sorting.
     * @param high      The ending index for sorting.
     * @param parameter The field by which the array will be sorted.
     */
    public static void quickSort(Product[] arr, int low, int high, String parameter) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, parameter);
            quickSort(arr, low, pivotIndex - 1, parameter);
            quickSort(arr, pivotIndex + 1, high, parameter);
        }
    }

    /**
     * Partitions an array for quick sort.
     *
     * @param arr       The array to be partitioned.
     * @param low       The starting index for partitioning.
     * @param high      The ending index for partitioning.
     * @param parameter The field by which the partition will be decided.
     * @return          The index of the partition.
     */
    private static int partition(Product[] arr, int low, int high, String parameter) {
        Product pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            boolean condition = false;

            switch (parameter) {
                case "Name":
                    condition = arr[j].productName.compareTo(pivot.productName) < 0;
                    break;
                case "Rating":
                    condition = arr[j].productRating > pivot.productRating;
                    break;
                case "Price":
                    condition = arr[j].price < pivot.price;
                    break;
            }

            if (condition) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * Sorts and displays an array of Product objects.
     *
     * @param products  The array of Product objects to be sorted.
     * @param parameter The field by which to sort the products.
     */
    public static void sortAndDisplay(Product[] products, String parameter) {
        quickSort(products, 0, products.length - 1, parameter);

        for (Product product: products) {
            System.out.println(product.productName + " | " + product.productRating + " | " + product.price);
        }
    }
}
