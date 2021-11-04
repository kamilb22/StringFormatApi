package com.example.stringformatapi;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @RequestMapping("/lowerCase/{string}")
    public String lowerCase(@PathVariable String string, @RequestParam(required = false) String mode){
        return "";
    }

    @RequestMapping("/upperCase/{string}")
    public int upperCase(@PathVariable String string, @RequestParam(required = false) String mode){
        return 0;
    }

    @RequestMapping("/numbers/{string}")
    public int numbers(@PathVariable String string, @RequestParam(required = false) String mode){
        return 0;
    }

    @RequestMapping("/special/{string}")
    public int special(@PathVariable String string, @RequestParam(required = false) String mode){
        return 0;
    }
}
