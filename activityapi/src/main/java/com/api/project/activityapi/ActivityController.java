package com.api.project.activityapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
    @GetMapping
    public String index(){
        return "Welcome in Spring boot REST API !";
    }
}
