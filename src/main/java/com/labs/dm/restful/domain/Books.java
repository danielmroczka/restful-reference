package com.labs.dm.restful.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author daniel
 */
@XmlRootElement
public class Books {
    
    private String name;
    
    private List<Book> books = new ArrayList<Book>();

    @XmlElementWrapper
    @XmlElement(name="book")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
