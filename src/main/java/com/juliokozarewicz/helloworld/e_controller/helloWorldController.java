package com.juliokozarewicz.helloworld.e_controller;

import com.juliokozarewicz.helloworld.HelloworldApplication;
import com.juliokozarewicz.helloworld.d_services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(HelloworldApplication.BASE_URL_SERVICE)
class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    public Map<String, Object> handle(
        @RequestParam(
            value = "message", defaultValue = "Hello World!"
        ) String message
    ) {
        return helloWorldService.execute(message);

    }
}