/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.restful.service;

import com.labs.dm.restful.domain.Book;
import com.labs.dm.restful.domain.Books;
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
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response list() {
        Books books = new Books();
        books.setName("foo");
        books.getBooks().add(new Book("Nineteen Eighty-Four", "Orwell", 1949));
        books.getBooks().add(new Book("Thinking In Java", "Bruce Eckel", 2000));
        return Response.ok().entity(books).build();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getById() {
        Book book = new Book("Nineteen Eighty-Four", "Orwell", 1949);
        return Response.ok().entity(book).build();
    }
}
