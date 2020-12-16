package com.github.gilvangobbato.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
@NamedQuery(name = "discounted-products", query = "select product from Product product where product.discounted IS NOT NULL")
public class Product {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Integer price;

    private Integer discounted;
}
