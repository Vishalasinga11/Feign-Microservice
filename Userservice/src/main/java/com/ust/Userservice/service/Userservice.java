package com.ust.Userservice.service;

import com.ust.Userservice.Feign.PostFeign;
import com.ust.Userservice.client.Fullresponse;
import com.ust.Userservice.client.Post;
import com.ust.Userservice.model.User;
import com.ust.Userservice.repository.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Userservice {

    @Autowired
    private Userrepo userrepo;

    @Autowired
    private PostFeign postFeign;

    public User adduser(User user) {

        return userrepo.save(user);
    }

    public Fullresponse findByuserid(int userid) {
     User user = userrepo.findById(userid).orElse(null);
     List<Post> posts=postFeign.findPostsByUserId(userid);
     Fullresponse res= new Fullresponse();
     res.setUserId(user.getUserId());
     res.setUsername(user.getUsername());
     res.setPassword(user.getPassword());
     res.setEmail(user.getEmail());
     res.setCreateddate(user.getCreateddate());
     res.setUpdateddate(user.getUpdateddate());
     res.setPosts(posts);
     return res;
    }


    public List<User> getallUsers() {
        return userrepo.findAll();
    }
}
