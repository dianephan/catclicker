package com.example.catclicker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatRestController {
    private int counter = 0;
    @PostMapping("/catclicker")
    public String clicker() {
        counter += 1;
        return "counter here " + counter;
    }

    @GetMapping("/catclicker")
//    return JSON object instead. CSR
    public String returnClick() {
        return "counter here " + counter;
    }

}
