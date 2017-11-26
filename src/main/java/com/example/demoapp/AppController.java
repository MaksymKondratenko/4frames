package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
         List<String> memberList = dataService.setupData().getMemberList();
/*        String clientInfo = dataService.setupClientInfo();
        ArrayList<String> opportunitiesList = dataService.setupOpportunitiesList();*/
        modelMap.put("memberList", memberList);
 /*       modelMap.put("clientInfo", clientInfo);
        modelMap.put("opportunitiesList", opportunitiesList);*/
        return "first";
    }
    @RequestMapping(value = "/web-content", method = RequestMethod.GET)
    public String contentPage() {
        return "content-page";
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customerPage() {
        return "customer-page";
    }
    @RequestMapping(value = "/opportunities", method = RequestMethod.GET)
    public String oppPage() {
        return "opp-page";
    }
}
