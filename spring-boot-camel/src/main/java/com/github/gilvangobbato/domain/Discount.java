package com.github.gilvangobbato.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue
    private int id;

    private Integer amount;

    @OneToOne
    private Product product;
}
