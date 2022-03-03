package com.example.springjsp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO - PlainObject Java Object
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "categoryID") //su dung cho truong hop ten bang trong db khac voi truong POJO
    private String categoryID;

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "description")
    private String description;

    public Category() {
    }

    public Category(String categoryID, String categoryName, String description) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
