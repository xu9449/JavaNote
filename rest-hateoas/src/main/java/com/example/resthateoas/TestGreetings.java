package com.example.resthateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class TestGreetings extends RepresentationModel<TestGreetings> {

    private final String content;

    @JsonCreator
    public TestGreetings(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
