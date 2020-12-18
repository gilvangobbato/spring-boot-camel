package com.github.gilvangobbato.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRout extends RouteBuilder {
    public static final String ROUT_URI = "direct:camelRout";
    @Override
    public void configure() throws Exception {
        from(ROUT_URI);
    }

}
