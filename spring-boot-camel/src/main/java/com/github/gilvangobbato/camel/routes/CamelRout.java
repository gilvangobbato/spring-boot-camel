package com.github.gilvangobbato.camel.routes;

import com.github.gilvangobbato.repository.TimeRepository;
import lombok.AllArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
public class CamelRout extends RouteBuilder {

    public static final String ROUT_URI = "direct:camelRout";

    @Autowired
    private TimeRepository timeRepository;

    @Override
    public void configure() throws Exception {
        from(ROUT_URI)
                .bean(timeRepository)
                .log("${body}");
    }

}
