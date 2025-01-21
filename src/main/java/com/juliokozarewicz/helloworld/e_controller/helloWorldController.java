package com.juliokozarewicz.helloworld.e_controller;

import com.juliokozarewicz.helloworld.HelloworldApplication;
import com.juliokozarewicz.helloworld.d_services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(HelloworldApplication.BASE_URL)
class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/helloworld")
    public Map<String, Object> handle() {
        return helloWorldService.execute();
    }
}