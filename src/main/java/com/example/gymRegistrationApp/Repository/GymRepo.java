package com.example.gymRegistrationApp.Repository;

import com.example.gymRegistrationApp.entity.GYM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepo extends JpaRepository<GYM,Integer> {

}
