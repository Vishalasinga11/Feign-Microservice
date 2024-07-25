package com.ust.ReviewService.Repository;

import com.ust.ReviewService.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review,Integer> {
    List<Review> findByPostId(int postId);
}
