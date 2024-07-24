package com.ust.Commentservice.controller;

import com.ust.Commentservice.Model.Comment;
import com.ust.Commentservice.service.Commentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private Commentservice commentService;

    @PostMapping("/addcomment")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/getallcomments/{postId}")
    public List<Comment> getAllComments(@PathVariable int postId){

        return commentService.getAllCommentsById(postId);

    }

    @GetMapping("/getall")
    public List<Comment> getall(){
        return commentService.getAllComments();
    }


}
