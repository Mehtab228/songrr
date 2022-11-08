package com.myCodeFellowSongrr.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/")
    public String splashRoute(){
        return "splash";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalizeInput(@PathVariable String word, Model m){
        String newWord = word.toUpperCase();
        m.addAttribute("word", newWord);
        return "capitalize.html";
    }
}
