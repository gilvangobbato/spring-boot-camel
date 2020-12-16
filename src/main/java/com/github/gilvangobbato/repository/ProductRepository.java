package com.github.gilvangobbato.repository;

import com.github.gilvangobbato.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
