package com.solncev.controller;

import com.solncev.aspect.Loggable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Loggable
    @GetMapping(value = "index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/profile")
    public String profile() {
        return "profile";
    }
}
