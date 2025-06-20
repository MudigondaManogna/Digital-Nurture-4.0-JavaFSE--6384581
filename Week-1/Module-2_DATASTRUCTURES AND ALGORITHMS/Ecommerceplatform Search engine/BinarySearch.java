import java.util.*;

public class BinarySearch {
    public static Product search(Product[] products, String keyword) {
        keyword = keyword.toLowerCase();
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products[mid].productName.toLowerCase();

            int comparison = midName.compareTo(keyword);
            if (comparison == 0)
                return products[mid];
            else if (comparison < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
}