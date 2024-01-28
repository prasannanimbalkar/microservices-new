package com.prasannanimbalker.productservice.repository;

import com.prasannanimbalker.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
