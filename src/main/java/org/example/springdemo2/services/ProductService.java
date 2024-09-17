package org.example.springdemo2.services;

import org.example.springdemo2.models.Product;
import org.example.springdemo2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    @Autowired
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public void deleleProduct(Long id){
        repository.deleteById(id);
    }
}
