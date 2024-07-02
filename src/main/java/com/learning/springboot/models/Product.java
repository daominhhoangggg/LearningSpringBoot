package com.learning.springboot.models;

import jakarta.persistence.*;

// POJO - Plain Object Java Object
@Entity
@Table(name = "product")
public class Product {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1 //increment by 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Long id;
    @Column(nullable = false, unique = true, length = 300)
    private String productName;
    private int productYear;
    private Double price;
    private String url;
    //calculated field = transient
    @Transient
    private int age;

    //default constructor
    public Product() {
    }

    public Product(String productName, int productYear, Double price, String url) {
        this.productName = productName;
        this.productYear = productYear;
        this.price = price;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productYear=" + productYear +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
