import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceSearch {
    private List<Product> products;

    public ECommerceSearch() {
        products = new ArrayList<>();
        // Sample data
        products.add(new Product(1, "iPhone 14", "Electronics"));
        products.add(new Product(2, "Samsung Galaxy", "Electronics"));
        products.add(new Product(3, "Nike Shoes", "Footwear"));
        products.add(new Product(4, "Adidas Sneakers", "Footwear"));
        products.add(new Product(5, "HP Laptop", "Electronics"));
    }

    public void search(String query, String type) {
        boolean found = false;
        for (Product product : products) {
            if (type.equalsIgnoreCase("name") && product.getName().toLowerCase().contains(query.toLowerCase())) {
                product.display();
                found = true;
            } else if (type.equalsIgnoreCase("category")
                    && product.getCategory().toLowerCase().contains(query.toLowerCase())) {
                product.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECommerceSearch searchEngine = new ECommerceSearch();

        System.out.print("Search by (name/category): ");
        String type = sc.nextLine();

        System.out.print("Enter search term: ");
        String query = sc.nextLine();

        System.out.println("\nSearch Results:");
        searchEngine.search(query, type);

        sc.close();
    }
}
