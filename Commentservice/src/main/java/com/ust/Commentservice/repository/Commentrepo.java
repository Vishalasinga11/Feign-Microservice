package com.ust.Commentservice.repository;

import com.ust.Commentservice.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Commentrepo extends JpaRepository<Comment,Integer>{
    List<Comment> findByPostId(int postId);
}
