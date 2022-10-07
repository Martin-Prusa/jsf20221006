package cz.martin.eshop;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EshopService {
    private List<Product> products = new ArrayList<>();

    public EshopService() {
        this.products.add(new Product("iPhone 13", "description"));
        this.products.add(new Product("iPhone 13 Pro", "description 02"));
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
