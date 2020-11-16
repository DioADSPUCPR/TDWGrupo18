/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw18.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ocimi
 */
@Entity
@Table(name = "bookv2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookv2.findAll", query = "SELECT b FROM Bookv2 b"),
    @NamedQuery(name = "Bookv2.findById", query = "SELECT b FROM Bookv2 b WHERE b.id = :id"),
    @NamedQuery(name = "Bookv2.findByName", query = "SELECT b FROM Bookv2 b WHERE b.name = :name"),
    @NamedQuery(name = "Bookv2.findByAuthor", query = "SELECT b FROM Bookv2 b WHERE b.author = :author"),
    @NamedQuery(name = "Bookv2.findByCoAuthor", query = "SELECT b FROM Bookv2 b WHERE b.coAuthor = :coAuthor"),
    @NamedQuery(name = "Bookv2.findByIsbn", query = "SELECT b FROM Bookv2 b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Bookv2.findByCategory", query = "SELECT b FROM Bookv2 b WHERE b.category = :category"),
    @NamedQuery(name = "Bookv2.findByYear", query = "SELECT b FROM Bookv2 b WHERE b.year = :year"),
    @NamedQuery(name = "Bookv2.findByPrice", query = "SELECT b FROM Bookv2 b WHERE b.price = :price")})
public class Bookv2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "author")
    private String author;
    @Size(max = 100)
    @Column(name = "coAuthor")
    private String coAuthor;
    @Size(max = 100)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "category")
    private String category;
    @Column(name = "year")
    private Integer year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;

    public Bookv2() {
    }

    public Bookv2(Integer id) {
        this.id = id;
    }

    public Bookv2(Integer id, String name, String author, String category, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookv2)) {
            return false;
        }
        Bookv2 other = (Bookv2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tdw18.entities.Bookv2[ id=" + id + " ]";
    }
    
}
