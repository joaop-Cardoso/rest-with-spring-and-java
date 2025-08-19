package com.joaop_Cardoso.services;

import com.joaop_Cardoso.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service //pra que essa classe fique disponivel e seja injetável onde precisar
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("João");
        person.setLastName("Reis");
        person.setAddress("Juiz de Fora - MG - Brasil");
        person.setGender("Male");

        return person;
    }

}
