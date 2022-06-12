package com.ousseynou.mbodji.backendmodelsis.services.interfaces;

import com.ousseynou.mbodji.backendmodelsis.entities.Product;
import com.ousseynou.mbodji.backendmodelsis.entities.ProductType;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProduct(Long id);
    Product addProduct(Product product);
    void deleteProduct(Long id);

    ProductType addTypeProduct(ProductType productType);
    List<ProductType> getAllProductType();
}
