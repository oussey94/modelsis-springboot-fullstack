package com.ousseynou.mbodji.backendmodelsis.restController;

import com.ousseynou.mbodji.backendmodelsis.entities.Product;
import com.ousseynou.mbodji.backendmodelsis.entities.ProductType;
import com.ousseynou.mbodji.backendmodelsis.services.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestController {
    private final ProductService productService;

    @GetMapping
    public List<Product> allProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
    
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        Product p = productService.getProduct(id);
        p.setName(product.getName());
        p.setCreated_at(product.getCreated_at());
        p.setType(product.getType());

        return productService.addProduct(product);
    }

    //*******************************************Pour le Type Product (Liste et Ajout)*********************************************

    @GetMapping(path = "/allTypeProducts")
    public List<ProductType> getAllTypeProd(){
        return productService.getAllProductType();
    }

    @PostMapping(path = "/productType")
    public ProductType addTypeProduct(@RequestBody ProductType productType){
        return productService.addTypeProduct(productType);
    }
}
