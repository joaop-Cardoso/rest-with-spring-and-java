package com.joaop_Cardoso.controllers;
import com.joaop_Cardoso.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting?name=qualque1
    @RequestMapping("/greeting") //para ser reconhecido como um metodo exposto via http
    public Greeting greeting(
            //Definindo requestparams
            @RequestParam(value = "name", defaultValue = "world")
            String name)
    {
        return new Greeting(counter.addAndGet(1), String.format("Hello, %s", name));
    }
}
