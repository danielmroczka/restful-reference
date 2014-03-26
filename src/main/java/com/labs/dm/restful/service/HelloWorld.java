package com.labs.dm.restful.service;

import com.labs.dm.restful.domain.Hello;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Hello";
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Hello simplejson() {
        Hello welcome = new Hello();
        welcome.setDomain("domain1");
        welcome.setMessage("msg1");
        return welcome;
    }

}
