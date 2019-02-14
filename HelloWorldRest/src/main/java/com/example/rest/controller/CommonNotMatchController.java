package com.example.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.CommonNotMatchData;

/**
 * 
 * @author jpsimon
 * 
 * PROJECT
 * 
 * Greeting controller class is shared in project and product but new method greetingRemarks was added on project
 *
 */
@RestController
public class CommonNotMatchController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting", produces = "application/json")
    public CommonNotMatchData greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new CommonNotMatchData(counter.incrementAndGet(),
                            String.format(template, name), null);
    }
    
    @GetMapping(value = "/greeting/remarks", produces = "application/json")
    public CommonNotMatchData greetingRemarks(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="remarks") String remarks) {
        return new CommonNotMatchData(counter.incrementAndGet(),
                            String.format(template, name), remarks);
    }
    
    /*@GetMapping(value = "/greeting/evolution1/project", produces = "application/json")
    public Greeting greetingEvoluction1(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="evolution1", defaultValue="evolution1") String evolution1) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), evolution1);
    }*/
}
