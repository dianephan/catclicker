package com.example.catclicker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
// to render the html page
// @restcontroller for serving data and restpoints
public class WebController {
    @GetMapping("/cat")
    public String helloCat(Model message){
        message.addAttribute("welcome", "fkdajfasd");
        return "cat";
    }
}

