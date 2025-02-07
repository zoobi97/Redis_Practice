package com.practice.Redis.Repository;

import com.practice.Redis.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {

    public static final String HASH_KEY="Product";

    @Autowired
    private RedisTemplate template;

    public Product save(Product product){
        template.opsForHash().put(HASH_KEY, product.getId(),product);
        return product;
    }

    public List<Product> findAllProducts(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Product findById(int Id){
        return (Product) template.opsForHash().get(HASH_KEY, Id);
    }

    public String deleteById(int Id){
         template.opsForHash().delete(HASH_KEY, Id);
         return "Product deleted with Id: "+Id;
    }
}
