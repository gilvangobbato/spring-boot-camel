package com.github.gilvangobbato.presentation;

import com.github.gilvangobbato.domain.Response;
import com.github.gilvangobbato.services.CamelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private CamelService camelService;

    @GetMapping
    public ResponseEntity<Response> processes(){
        return ResponseEntity.ok(camelService.getTime());
    }
}
