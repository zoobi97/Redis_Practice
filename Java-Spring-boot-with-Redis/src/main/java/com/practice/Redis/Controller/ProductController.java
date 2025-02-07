package com.practice.Redis.Controller;

import com.practice.Redis.Entity.Product;
import com.practice.Redis.Repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductDAO dao;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return dao.save(product);
    }

    @GetMapping("/findAll")
    public List<Product> getAllProducts(){
        return dao.findAllProducts();
    }

    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable int id){
        return dao.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        return dao.deleteById(id);
    }
}
