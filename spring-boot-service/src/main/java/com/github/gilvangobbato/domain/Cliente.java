package com.github.gilvangobbato.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private Long id;
    private String nome;
    private String documento;

}
