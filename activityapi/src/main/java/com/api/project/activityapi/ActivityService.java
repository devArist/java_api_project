package com.api.project.activityapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService{
    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> listAll(){
        return activityRepository.findAll();
    }

    public Activity get(Integer id) {
        return activityRepository.findById(id).get();
    }

    public void delete(Integer id){
        activityRepository.deleteById(id);
    }

    public void save(Activity activity){
        activityRepository.save(activity);
    }
}