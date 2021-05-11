package com.MacbookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String home() {
//        return "Web/home";
//    }
//    @RequestMapping(value = "/contact", method = RequestMethod.GET)
//    public String contact() {
//        return "Web/contact";
//    }
//    @RequestMapping(value = "/about", method = RequestMethod.GET)
//    public String about() {
//        return "Web/about";
//    }
//    @RequestMapping(value = "/services", method = RequestMethod.GET)
//    public String services() {
//        return "Web/services";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage() {
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage() {
        return "contact";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage() {
        return "about";
    }

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String servicePage() {
        return "service";
    }

    @RequestMapping(value = "/newest", method = RequestMethod.GET)
    public String newestPage() {
        return "newest";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detailPage() {
        return "detail";
    }
}