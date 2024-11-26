package org.task.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.task.model.Product;

public interface ProductServiceInterface {

    Page<Product> getAllProducts(Pageable pageable);

    Product createProduct(Product product);

    Product getProductById(Long id);

    Product updateProduct(Long id, Product updatedProduct);

    boolean deleteProduct(Long id);
}
