package com.ratingservice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = { "/home"}, method = RequestMethod.GET)
    public String getHomePage(ModelMap modelMap)
    {
        return "home";
    }

    @RequestMapping(path = { "/"}, method = RequestMethod.GET)
    public String getRootPage(ModelMap modelMap)
    {
        return "home";
    }
}
