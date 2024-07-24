package com.ust.Commentservice.service;

import com.ust.Commentservice.Model.Comment;
import com.ust.Commentservice.repository.Commentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Commentservice {

    @Autowired
    private Commentrepo commentRepository;

    public Comment addComment(Comment comment) {
        Comment c=Comment.builder()
                .commentId(comment.getCommentId())
                .author(comment.getAuthor())
                .content(comment.getContent())
                .date(comment.getDate())
                .postId(comment.getPostId())
                .build();
        return commentRepository.save(c);
    }

    public List<Comment> getAllCommentsById(int postId) {
        return commentRepository.findByPostId(postId);

    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}
