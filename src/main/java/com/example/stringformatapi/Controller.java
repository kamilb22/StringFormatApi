package com.example.stringformatapi;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Controller {

    JSONObject stringToJSON(String string) {
        return new JSONObject("{ \"result\" : " + string + " }");
    }

    String stringToXML(String string) {
        return "<result>" + string + "<result>";
    }

    String stringToCSV(String string) {
        return "\"result\"\n" + string;
    }

    private String getResponseFromAnotherApi(String string) {
        final String uri = "http://localhost:8080" + string;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

    private String getString(@RequestParam(required = false) String mode, String stringApiResultString) {
        if (mode == null || mode.equals("json")) {
            JSONObject jo = stringToJSON(stringApiResultString);
            return jo.toString();
        } else if (mode.equals("xml")) {
            return stringToXML(stringApiResultString);
        } else if (mode.equals("csv")) {
            return stringToCSV(stringApiResultString);
        }
        return "";
    }

    @RequestMapping("/lowerCase/{string}")
    public String lowerCase(@PathVariable String string, @RequestParam(required = false) String mode) {
        String stringApiResultString = getResponseFromAnotherApi("/lowerCase/" + string);
        return getString(mode, stringApiResultString);
    }


    @RequestMapping("/upperCase/{string}")
    public String upperCase(@PathVariable String string, @RequestParam(required = false) String mode) {
        String stringApiResultString = getResponseFromAnotherApi("/upperCase/" + string);
        return getString(mode, stringApiResultString);
    }



    @RequestMapping("/numbers/{string}")
    public String numbers(@PathVariable String string, @RequestParam(required = false) String mode) {
        String stringApiResultString = getResponseFromAnotherApi("/numbers/" + string);
        return getString(mode, stringApiResultString);
    }

    @RequestMapping("/special/{string}")
    public String special(@PathVariable String string, @RequestParam(required = false) String mode) {
        String stringApiResultString = getResponseFromAnotherApi("/special/" + string);
        return getString(mode, stringApiResultString);    }
}
