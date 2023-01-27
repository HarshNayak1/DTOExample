package net.harshnayak.springdtoproject.controller;


import net.harshnayak.springdtoproject.dto.UserLocationDTO;
import net.harshnayak.springdtoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){

        return userService.getAllUsersLocation();

    }
}
