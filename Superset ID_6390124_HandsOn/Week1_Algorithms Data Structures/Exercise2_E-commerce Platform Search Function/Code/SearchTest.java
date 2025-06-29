import java.util.Arrays;

public class SearchTest {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Shoes", "Footwear"),
                new Product(105, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, new ProductNameComparator());

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, "Shoes");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

/*
 * Comparison of Time Complexity:-
 * 
 * | Algorithm | Best Case | Average Case | Worst Case | Time Complexity Summary
 * |
 * | ------------- | --------- | ------------ | ---------- |
 * ------------------------------------- |
 * | Linear Search | O(1) | O(n) | O(n) | Grows linearly with input size |
 * | Binary Search | O(1) | O(log n) | O(log n) | Grows logarithmically with
 * input size |
 * 
 * Linear Search:-
 * 
 * Checks each element one-by-one.
 * Works on unsorted data.
 * Slower as the number of products increases.
 * 
 * Binary Search:-
 * 
 * Requires data to be sorted.
 * Divides the array in half during each step.
 * Much faster for large datasets.
 * 
 * -----------------------------------------------------------------------------
 * ---------------------
 * 
 * Which Algorithm is More Suitable and Why?
 * 
 * Binary Search is more suitable for an e-commerce platform because:-
 * 
 * It is significantly faster than linear search for large product
 * inventories.
 * E-commerce platforms often deal with thousands or millions of products,
 * where linear search becomes inefficient.
 * Product data can be pre-sorted by product name, ID, or category, enabling
 * the use of binary search.
 * Optimized searching enhances user experience and performance.
 * 
 * However, if the product list is unsorted and frequently updated or
 * small in size, linear search can be used for simplicity.
 * 
 */