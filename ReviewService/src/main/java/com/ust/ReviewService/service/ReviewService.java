package com.ust.ReviewService.service;

import com.ust.ReviewService.Repository.ReviewRepo;
import com.ust.ReviewService.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepo reviewRepository;

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> findReviewsByPostId(int postId) {
        return reviewRepository.findByPostId(postId);
    }
}