package com.practice.Redis.Controller;

import com.practice.Redis.Entity.Product;
import com.practice.Redis.Repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@EnableCaching
public class ProductController {

    @Autowired
    private ProductDAO dao;

    @PostMapping("/save")
//    @CachePut(key = "#id")
    public Product save(@RequestBody Product product){
        return dao.save(product);
    }

    @GetMapping("/findAll")
    public List<Product> getAllProducts(){
        return dao.findAllProducts();
    }

    @GetMapping("/findById/{id}")
    @Cacheable(key = "#id",value = "Product", unless = "#result.price>1000")
    public Product findById(@PathVariable int id){
        return dao.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    @CacheEvict(key = "#id", value = "Product")
    public String deleteById(@PathVariable int id){
        return dao.deleteById(id);
    }
}
