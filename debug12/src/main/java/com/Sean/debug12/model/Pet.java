package com.sean.debug12.model;

import java.util.Date;

public class Pet {
    private Long id;
    private String name;
    private String breed;
    private int string;
    private String shelter;
    private String description;
    private Date adoptdate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public Date getAdoptdate() {
        return adoptdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String getShelter() {
        return shelter;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
