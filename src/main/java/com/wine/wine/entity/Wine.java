package com.wine.wine.entity;

import javax.persistence.*;

@Entity
@Table(name ="WINE")
public class Wine {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = true, length = 255)
    private String name;

    @Column(nullable = true, length = 4)
    private String year;

    @Column(nullable = true, length = 255)
    private String grapes;

    @Column(nullable = true, length = 255)
    private String country;

    public Wine() {

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getGrapes() {
        return grapes;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
