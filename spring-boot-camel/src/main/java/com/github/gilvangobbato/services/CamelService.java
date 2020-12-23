package com.github.gilvangobbato.services;

import com.github.gilvangobbato.camel.CamelContextWrapper;
import com.github.gilvangobbato.camel.routes.CamelRout;
import com.github.gilvangobbato.domain.Response;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class CamelService {

    @Autowired
    private ProducerTemplate template;

//    public CamelService(CamelContextWrapper wrapper) {
//        this.template = wrapper.createProducerTemplate();
//    }

    public Response getTime(){
       return template.requestBody(CamelRout.ROUT_URI,
               "",
               Response.class);
   }
}
