package com.github.gilvangobbato.camel.routes;

import com.github.gilvangobbato.services.DiscountService;
import com.github.gilvangobbato.services.ProductService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProductController  extends RouteBuilder {
    
    @Autowired
    private Environment env;

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .contextPath("/javadevjournal")
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "JAVA DEV JOURNAL REST API")
                .apiProperty("api.version", "1.0")
                .apiProperty("cors", "true")
                .apiContextRouteId("doc-api")
                .port(env.getProperty("server.port", "8080"))
                .bindingMode(RestBindingMode.json);

        rest("/products").description("Details of products")
                .get("/").description("List of all products")
                .route().routeId("products-api")
                .bean(ProductService.class, "findAll")
                .endRest()
                .get("discounts/{id}").description("Discount of a product")
                .route().routeId("discount-api")
                .bean(DiscountService.class, "findDiscount(${header.id})");
    }
}
