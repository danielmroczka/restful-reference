/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.restful.service;

import com.labs.dm.restful.domain.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author daniel
 */
@Path("books")
public class BookService {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Nineteen Eighty-Four", "Orwell", 1949));
        list.add(new Book("Thinking In Java", "Bruce Eckel", 2000));
        return Response.ok().entity(list).build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response listXml() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Nineteen Eighty-Four", "Orwell", 1949));
        list.add(new Book("Thinking In Java", "Bruce Eckel", 2000));
        return Response.ok().entity(list).build();
    }
}
