package com.ust.Userservice.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    public int postId;
    public String title;
    public String description;
    public String author;
    public LocalDate date;
    public String status;
    public int userId;
}
