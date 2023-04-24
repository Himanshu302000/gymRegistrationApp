package com.example.gymRegistrationApp.Controller;

import com.example.gymRegistrationApp.Services.GymServices;
import com.example.gymRegistrationApp.entity.GYM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GymController {
    @Autowired
    GymServices services;
    @PostMapping("/postData")
    public GYM createData(@RequestBody GYM obj)
    {
        System.out.println("height is "+obj.getHeight());
        return services.createData(obj);
    }
}
