package com.learn.gitversioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git-learn")
public class Controller {

    @GetMapping("/branch-4")
    public String welcomeBranch1(){
        return "branch-4 ---- new branch 4";
    }
}
