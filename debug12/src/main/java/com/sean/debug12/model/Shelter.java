package com.sean.debug12.model;

public class Shelter {
    private Integer id;
    private String name;
    private String tel;
    private String email;
    private String location;
    private String description;
    private String principle;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getTel() {
        return tel;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPrinciple() {
        return principle;
    }
}


