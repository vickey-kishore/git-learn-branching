package com.learn.gitversioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git-learn")
public class Controller {

    @GetMapping("/branch-6")
    public String welcomeBranch6(){
        return "branch-6 ---- new branch 6";
    }
}
