package com.ust.Postserver.Feign;

import com.ust.Postserver.Client.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name="ReviewService", url="http://localhost:9094/review")
public interface ReviewFeign {
    @GetMapping("/getallreviews/{postId}")
    List<Review> findReviewsByPostId(@PathVariable("postId") int postId);
}
