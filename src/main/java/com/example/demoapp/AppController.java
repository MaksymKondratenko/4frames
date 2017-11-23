package com.example.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(){
        return "first";
    }
    @RequestMapping(value = "/web-content", method = RequestMethod.GET)
    public String contentPage(){
        return "content-page";
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customerPage(){
        return "customer-page";
    }
    @RequestMapping(value = "/opportunities", method = RequestMethod.GET)
    public String oppPage(){
        return "opp-page";
    }
}
