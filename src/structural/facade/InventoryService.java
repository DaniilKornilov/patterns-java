package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean isProductAvailable(Product product) {
        System.out.println("Checking if product: " + product.name() + " is available");
        return products.contains(product);
    }
}
