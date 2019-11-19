package org.pf4j.demo;

import org.pf4j.demo.api.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingsController {

    @Autowired
    private Greetings greetings;

//    This works with just the system extension, but fails with more than one even when one is marked @Primary
//    @Autowired
//    private Greeting greeting;

    @GetMapping(value = "/greetings")
    public List<String> getAll() {
        return greetings.getGreetings();
    }

//    @GetMapping(value = "/greeting")
//    public String getOne() {
//        return greeting.getGreeting();
//    }

}
