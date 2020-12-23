package com.github.gilvangobbato.repository.impl;

import com.github.gilvangobbato.domain.Response;
import com.github.gilvangobbato.repository.TimeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Repository
public class TimeRepositoryImpl implements TimeRepository {

    @Override
    public Response getTime() {
        log.info("---- INICIANDO BUSCA DE HORA ----");
        return Response.builder()
                .responseString(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)).build();
    }
}
