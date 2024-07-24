package com.ust.Postserver.repository;

import com.ust.Postserver.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface postrepository extends JpaRepository<Post,Integer> {
    List<Post> findByUserId(int userId);
}
