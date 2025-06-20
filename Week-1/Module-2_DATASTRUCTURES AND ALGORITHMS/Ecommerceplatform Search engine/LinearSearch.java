public class LinearSearch {
    public static Product search(Product[] products, String keyword) {
        keyword = keyword.toLowerCase();

        for (Product p : products) {
            if (p.productName.toLowerCase().contains(keyword)) {
                return p;
            }
        }
        return null;
    }
}