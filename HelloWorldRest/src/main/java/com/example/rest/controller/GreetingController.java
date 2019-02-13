package com.example.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.Greeting;

/**
 * 
 * @author jpsimon
 * 
 * Greeting controller class is shared in project and product but new method greetingRemarks was added on project
 *
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting", produces = "application/json")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), null);
    }
    
    @GetMapping(value = "/greeting/remarks", produces = "application/json")
    public Greeting greetingRemarks(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="remarks") String remarks) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), remarks);
    }
}
