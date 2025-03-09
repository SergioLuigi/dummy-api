package com.sergioluigi.dummy_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class DummyController {

    @GetMapping
    public String get() {
        System.err.println("DummyController.get called");
        return "ok";
    }
}
