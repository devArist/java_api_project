package com.api.project.activityapi;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping("api/activities")
    public List<Activity> list(){
        return activityService.listAll();
    }

    @GetMapping("api/activities/{id}")
    public ResponseEntity<Activity> get(@PathVariable Integer id){
        try{
            Activity activity = activityService.get(id);
            return new ResponseEntity<Activity>(activity, HttpStatus.OK);
        }
        catch(NoSuchElementException e){
            return new ResponseEntity<Activity>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/activities")
    public void post(@RequestBody Activity activity){
            activityService.save(activity);
    }

}
