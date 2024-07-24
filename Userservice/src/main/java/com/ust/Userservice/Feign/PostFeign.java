package com.ust.Userservice.Feign;

import com.ust.Userservice.client.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name="Postserver", url="http://localhost:9091/post")
public interface PostFeign {
    @GetMapping("/getposts/{userId}")
    List<Post> findPostsByUserId(@PathVariable("userId") Integer userId);
}








