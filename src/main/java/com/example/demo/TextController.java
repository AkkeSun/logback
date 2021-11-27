package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class TextController {

    @GetMapping("/")
    public String test(){

        log.trace("LOG TEST");
        log.debug("LOG TEST");
        log.info("LOG TEST");
        log.warn("LOG TEST");
        log.error("LOG TEST");

        return "TEST";
    }
}
