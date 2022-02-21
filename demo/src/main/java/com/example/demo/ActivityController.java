package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController{
    private static String name = "Welcome in Spring boot API REST";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("api/activities")
    public Activity activites(){
        return new Activity(counter.incrementAndGet(), name);
    }
}