package com.example.resthateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    private static final String TEMPLATE = "Howdy, %s";

    @RequestMapping("/greeting")
    public HttpEntity<TestGreetings> greeting(
            @RequestParam(value = "name", defaultValue = "World") String name) {
        TestGreetings greeting = new TestGreetings(String.format(TEMPLATE, name));
        greeting.add(linkTo(methodOn(GreetingController.class).greeting(name)).withSelfRel());

        return new ResponseEntity<>(greeting, HttpStatus.OK);

    }
}
