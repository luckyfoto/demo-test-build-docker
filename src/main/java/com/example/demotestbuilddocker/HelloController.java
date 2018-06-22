package com.example.demotestbuilddocker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HelloController {

    @GetMapping(value = "/hello/greeting")
    public ResponseEntity<String> greeting() {
        return new ResponseEntity<String>("Helloworld", null, HttpStatus.OK);
    }

}
