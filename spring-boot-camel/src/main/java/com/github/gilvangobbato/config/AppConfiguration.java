package com.github.gilvangobbato.config;

import com.github.gilvangobbato.camel.CamelContextWrapper;
import com.github.gilvangobbato.camel.routes.CamelRout;
import com.github.gilvangobbato.repository.TimeRepository;
import com.github.gilvangobbato.services.CamelService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .build();
    }

    @Bean
    public CamelService camelService(){
        return new CamelService();
    }
//    @Bean
//    public CamelService camelService(CamelContextWrapper wrapper){
//        return new CamelService(wrapper);
//    }
//
//    @Bean
//    public CamelContextWrapper camelContextWrapper(RouteBuilder... routes) throws Exception {
//        return new CamelContextWrapper(routes);
//    }

    @Bean
    public CamelRout camelRout(TimeRepository timeRepository){
        return new CamelRout(timeRepository);
    }
}
