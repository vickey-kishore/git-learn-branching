package com.learn.gitversioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git-learn")
public class Controller {

    @GetMapping("/master")
    public String welcome(){
        return "master branch ---- welcome";
    }
}
