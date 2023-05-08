package com.timoxino.interview.web.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    List<String> all() {
        return List.of("Hello World!");
    }

    @PostMapping
    Object create(@RequestBody Object occupation) {
        return new Object();
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
    }
}
