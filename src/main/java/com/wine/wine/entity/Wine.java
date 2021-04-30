package com.wine.wine.entity;

import javax.persistence.*;

@Entity
@Table(name ="WINE")
public
class Wine {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = true, length = 255)
    private String name;

    @Column(name = "YEAR", nullable = true, length = 4)
    private String year;

    public Wine(Integer id, String name, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

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

}
