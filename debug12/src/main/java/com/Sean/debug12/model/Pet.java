package com.sean.debug12.model;

import java.util.Date;

public class Pet {
    private Long id;
    private String name;
    private String age;
    private String breed;
    private String shelter;
    private String description;
    private Date adoptdate;

    // Set
    public void setId(Long id) { this.id = id; }
    public void setBreed(String breed) {this.breed = breed;}
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {this.description = description; }

    public void setAge(String age) { this.age = age;}

    public void setAdoptdate(Date adoptdate) {
        this.adoptdate = adoptdate;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }

    // Get
    public Long getId() { return id; }
    public String getBreed() { return breed; }
    public Date getAdoptdate() { return adoptdate; }
    public String getName() { return name; }
    public String getShelter() { return shelter; }
    public String getAge() { return age; }

    public String getDescription() {
        return description;
    }
}