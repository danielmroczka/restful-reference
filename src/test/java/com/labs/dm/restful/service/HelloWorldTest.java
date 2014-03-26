package com.labs.dm.restful.service;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(HelloWorld.class);
    }

    @Test
    public void test() {
        final Response hello = target("hello").request().get();
        assertEquals(200, hello.getStatus());
    }

    @Test
    public void testJson() {
        final Response hello = target("hello/json").request().get();
        assertEquals(MediaType.APPLICATION_JSON_TYPE, hello.getMediaType());
    }

}
