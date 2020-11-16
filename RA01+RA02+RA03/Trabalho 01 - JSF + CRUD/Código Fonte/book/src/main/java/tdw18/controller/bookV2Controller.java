/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw18.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import tdw18.entities.Bookv2;
import tdw18.sessionbean.Bookv2FacadeLocal;

/**
 *
 * @author ocimi
 */
@Named(value = "bookV2Controller")
@SessionScoped
public class bookV2Controller implements Serializable {

    @EJB
    private Bookv2FacadeLocal booksFacade;

    private Bookv2 selectedBook;

    private final Bookv2 bookv2 = new Bookv2();
    private String name;
    private String author;
    private String coAuthor;
    private String isbn;
    private Integer year;
    private String category;
    private float price;

    /**
     * Creates a new instance of bookController
     */
    public bookV2Controller() {
    }

    public Bookv2 getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Bookv2 selectedBook) {
        this.selectedBook = selectedBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoAuthor() {
        return coAuthor;
    }

    public void setCoAuthor(String coAuthor) {
        this.coAuthor = coAuthor;
    }

        public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void emptyVariables() {
        this.author = "";
        this.coAuthor = "";
        this.isbn = "";
        this.category = "";
        this.name = "";
        this.price = 0;
        this.year = 0;
    }

    public String createBook() {
        this.bookv2.setAuthor(this.author);
        this.bookv2.setCoAuthor(this.coAuthor);
        this.bookv2.setIsbn(this.isbn);
        this.bookv2.setCategory(this.category);
        this.bookv2.setName(this.name);
        this.bookv2.setPrice(this.price);
        this.bookv2.setYear(this.year);
        this.booksFacade.create(this.bookv2);
        this.emptyVariables();
        return "index.xhtml?faces-redirect=true";
    }

    public List<Bookv2> getAllBooks() {
        return this.booksFacade.findAll();
    }

    public String updateBook(Bookv2 book) {
        this.booksFacade.edit(this.selectedBook);
        return "index.xhtml?faces-redirect=true";
    }

    public String deleteBook(Bookv2 book) {
        this.booksFacade.remove(book);
        return "index.xhtml?faces-redirect=true";
    }

}
