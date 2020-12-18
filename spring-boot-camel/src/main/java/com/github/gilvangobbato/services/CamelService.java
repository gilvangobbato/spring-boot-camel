package com.github.gilvangobbato.services;

import com.github.gilvangobbato.repository.TimeRepository;
import lombok.AllArgsConstructor;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CamelService {

    @Autowired
    private ProducerTemplate template;

   public String getTime(){
        return "";
   }
}
