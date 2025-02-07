package com.practice.Redis;

import com.practice.Redis.Entity.Product;
import com.practice.Redis.Repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.practice.Redis")
public class JavaSpringBootWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootWithRedisApplication.class, args);
	}

}
