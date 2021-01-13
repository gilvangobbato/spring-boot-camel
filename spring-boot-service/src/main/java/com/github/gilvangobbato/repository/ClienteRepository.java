package com.github.gilvangobbato.repository;

import com.github.gilvangobbato.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {
    Optional<List<Cliente>> findAll();
}
