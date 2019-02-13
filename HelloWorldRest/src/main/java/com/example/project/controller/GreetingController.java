package com.example.project.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.data.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), null);
    }
    
    @RequestMapping(value = "/remarks", method = RequestMethod.GET, produces = "application/json")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="remarks") String remarks) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), remarks);
    }
}
