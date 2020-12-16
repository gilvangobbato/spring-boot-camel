package com.github.gilvangobbato.repository;

import com.github.gilvangobbato.domain.Discount;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepository extends CrudRepository<Discount, Integer> {
}
