package com.example.shop.services;

import com.example.shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private int id = 0;

    {
        products.add(new Product(++id, "CPU", "pizdu", 2500, "Muhosransk"));
        products.add(new Product(++id, "GPU", "pizdu2", 2222, "Muhosranska"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void createProduct(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProductByID(int finalId) {
        --id;
        products.removeIf(product -> product.getId() == finalId);
    }

    public Product getProductByID(int id) {
        for (Product product : products)
            if (product.getId() == id)
                return product;
        return null;
    }
}