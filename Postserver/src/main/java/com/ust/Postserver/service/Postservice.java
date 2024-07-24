package com.ust.Postserver.service;


import com.ust.Postserver.Client.Comment;
import com.ust.Postserver.Client.Responsebody;
import com.ust.Postserver.Feign.CommentFeign;
import com.ust.Postserver.dto.Postdto;
import com.ust.Postserver.model.Post;
import com.ust.Postserver.repository.postrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Postservice {
    @Autowired
    private postrepository postRepository;

    @Autowired
    private CommentFeign commentFeign;

    public Post createPost(Postdto postdtolist) {
        Post post = Post.builder()
                .postId(postdtolist.getPostId())
                .title(postdtolist.getTitle())
                .description(postdtolist.getDescription())
                .author(postdtolist.getAuthor())
                .date(postdtolist.getDate())
                .status(postdtolist.getStatus())
                .userId(postdtolist.getUserId())
                .build();
        return postRepository.save(post);
    }

    public List<Post> getAlLPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(int postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public Responsebody getAllCommentsById(int postId) {
        Post c=postRepository.findById(postId).orElse(null);
        List<Comment> list=commentFeign.findCommentsByPostId(postId);
        Responsebody res= new Responsebody();
        res.setPostId(c.getPostId());
        res.setTitle(c.getTitle());
        res.setDescription(c.getDescription());
        res.setAuthor(c.getAuthor());
        res.setDate(c.getDate());
        res.setStatus(c.getStatus());
        res.setComments(list);
        return res;
    }

    public List<Comment> getAll() {
        return commentFeign.getAll();
    }

    public List<Post> getPostsByUserId(int userId) {
        return postRepository.findByUserId(userId);
    }
}

