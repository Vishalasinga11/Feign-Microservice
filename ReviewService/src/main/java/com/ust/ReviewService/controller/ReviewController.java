package com.ust.ReviewService.controller;

import com.ust.ReviewService.model.Review;
import com.ust.ReviewService.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addreviews")
    public Review addReview(@RequestBody Review review){
        return reviewService.addReview(review);
    }


    @GetMapping("/getallreviews/{postId}")
    public List<Review> findReviewsByPostId(@PathVariable("postId") int postId){

        return reviewService.findReviewsByPostId(postId);
    }
}
