package com.spring.in.action.controller;

import com.spring.in.action.model.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;


@RestController
@RequestMapping("/basic")
public class WebController {

    @GetMapping("/_health")
    public Map<String, String> health(){
        return Collections.singletonMap("status", "UP");
    }


    @PostMapping(value = "/value", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Value value(@RequestBody Value value) {
        return value;
    }
}
