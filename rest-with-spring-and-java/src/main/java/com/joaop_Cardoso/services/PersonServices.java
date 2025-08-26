package com.joaop_Cardoso.services;

import com.joaop_Cardoso.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<Person> findAll(){
        logger.info("Getting everyone!");

        List persons = new ArrayList<Person>();
        for(int i=0; i<8; i++)
        {
            persons.add(mockPerson(i));
        }
        return persons;
    }

    public Person mockPerson (int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("João");
        person.setLastName("Reis " + i);
        person.setAddress("Somewhere");
        person.setGender("Male");

        return person;
    }


}
