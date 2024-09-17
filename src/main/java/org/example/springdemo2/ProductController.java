package org.example.springdemo2;

import org.example.springdemo2.models.Product;
import org.example.springdemo2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;
    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }
    @GetMapping
    public List<Product> getProducts(){
        return  service.getProducts();
    }
    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return  service.getProductById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        service.deleleProduct(id);
    }
}
