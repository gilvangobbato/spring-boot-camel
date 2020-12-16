package com.github.gilvangobbato.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController(value = "/v1")
public class ApiController {

    @GetMapping()
    public ResponseEntity<String> returnTime(){
        return ResponseEntity.ok(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
