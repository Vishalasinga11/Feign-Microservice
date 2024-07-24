package com.ust.Postserver.controller;

import com.ust.Postserver.Client.Comment;
import com.ust.Postserver.Client.Responsebody;
import com.ust.Postserver.dto.Postdto;
import com.ust.Postserver.model.Post;
import com.ust.Postserver.service.Postservice;
import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/post")
public class postcontroller {
    @Autowired
    private Postservice postService;


    @PostMapping("/createpost")
    public ResponseEntity<Post> createPost(@RequestBody Postdto postdto) {
        Post createdPost = postService.createPost(postdto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
    }

    @GetMapping("/getallposts")
    public List<Post> getAllPosts(){
        return postService.getAlLPosts();
    }

    @GetMapping("/getpostbyid/{postId}")
    public ResponseEntity<Post> getPostById(@PathVariable int postId){
        Post post = postService.getPostById(postId);
        if(post == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(post);

    }

    @GetMapping("/getallcomments/{postId}")
    public Responsebody getAllComments(@PathVariable("postId") int postId){

        return postService.getAllCommentsById(postId);

    }

    @GetMapping("/getall")
    public List<Comment> getAll(){
        return postService.getAll();
    }

    @GetMapping("/getposts/{userId}")
    public List<Post> getposts(@PathVariable int userId){
        return postService.getPostsByUserId(userId);
    }

}
