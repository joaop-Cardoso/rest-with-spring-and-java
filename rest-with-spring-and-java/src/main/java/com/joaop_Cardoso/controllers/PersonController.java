package com.joaop_Cardoso.controllers;

import com.joaop_Cardoso.model.Person;
import com.joaop_Cardoso.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired // spring injeta quando necessário
    private PersonServices service;

    @RequestMapping
            (value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id ){
        return service.findById(id);
    }
}
