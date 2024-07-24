package com.ust.Postserver.Feign;

import com.ust.Postserver.Client.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name="Commentservice", url="http://localhost:9092/comments")
public interface CommentFeign {


    @GetMapping("getallcomments/{postId}")
    List<Comment> findCommentsByPostId(@PathVariable("postId") int postId);

    @GetMapping("/getall")
    List<Comment> getAll();
}



