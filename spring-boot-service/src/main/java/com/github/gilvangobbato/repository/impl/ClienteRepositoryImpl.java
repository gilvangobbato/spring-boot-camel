package com.github.gilvangobbato.repository.impl;

import com.github.gilvangobbato.domain.Cliente;
import com.github.gilvangobbato.repository.ClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Override
    public Optional<List<Cliente>> findAll(){

    }

}
