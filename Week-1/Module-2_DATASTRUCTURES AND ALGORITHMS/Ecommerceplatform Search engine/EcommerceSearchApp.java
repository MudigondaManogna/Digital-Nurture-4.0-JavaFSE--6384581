import java.util.*;

public class EcommerceSearchApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Kitchen + Home Decor Products
        Product[] products = {
                new Product(201, "Stainless Steel Pressure Cooker", "Kitchen"),
                new Product(202, "Non-stick Frying Pan", "Kitchen"),
                new Product(203, "Electric Kettle", "Kitchen"),
                new Product(204, "Wall Hanging Decor", "Home Decor"),
                new Product(205, "Wooden Showpiece", "Home Decor"),
                new Product(206, "Rice Cooker", "Kitchen"),
                new Product(207, "Cushion Cover Set", "Home Decor")
        };

        System.out.print("Enter product to search: ");
        String keyword = sc.nextLine();

        // Linear Search
        Product result1 = LinearSearch.search(products, keyword);
        System.out.println("\n🔍 Linear Search Result:");
        if (result1 != null)
            result1.display();
        else
            System.out.println("❌ Product not found using Linear Search.");

        // Sort for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        Product result2 = BinarySearch.search(products, keyword);
        System.out.println("\n⚡ Binary Search Result:");
        if (result2 != null)
            result2.display();
        else
            System.out.println("❌ Product not found using Binary Search.");

        sc.close();
    }
}
