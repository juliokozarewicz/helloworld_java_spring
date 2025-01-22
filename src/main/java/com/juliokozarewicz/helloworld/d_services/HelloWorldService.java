package com.juliokozarewicz.helloworld.d_services;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class HelloWorldService {

    public Map<String, Object> execute(String message) {

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("statusCode", 200);
        response.put("statusMessage", "success");
        response.put("message", message);

        return response;

    }
}
