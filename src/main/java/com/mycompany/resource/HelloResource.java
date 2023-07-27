package com.mycompany.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mycompany.models.ResponseBody;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseBody sayHello() {
        return new ResponseBody(200, "Hello World!");
    }
}
