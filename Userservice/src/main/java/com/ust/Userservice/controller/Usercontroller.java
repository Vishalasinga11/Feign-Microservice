package com.ust.Userservice.controller;

import com.ust.Userservice.client.Fullresponse;
import com.ust.Userservice.client.Post;
import com.ust.Userservice.model.User;
import com.ust.Userservice.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @PostMapping("/adduser")
    public User adduser(@RequestBody User user){

        return userservice.adduser(user);
    }

    @GetMapping("/getposts/{userId}")
    public Fullresponse getposts(@RequestParam int userid){
        return userservice.findByuserid(userid);
    }

    @GetMapping("/getallUsers")
    public List<User> getallUsers(){
        return userservice.getallUsers();
    }
}
