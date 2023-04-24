package com.example.gymRegistrationApp.Services;

import com.example.gymRegistrationApp.Repository.GymRepo;
import com.example.gymRegistrationApp.entity.GYM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymServices {

    @Autowired
    GymRepo repo;
    public GYM createData(GYM obj) {
        return repo.save(obj);
    }
}
