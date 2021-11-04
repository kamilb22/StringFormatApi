package com.example.stringformatapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/lowerCase/{string}")
    public int lowerCase(@PathVariable String string, @RequestParam(required = false) String mode){
        return 0;
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
