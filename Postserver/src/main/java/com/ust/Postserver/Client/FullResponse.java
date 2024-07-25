package com.ust.Postserver.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
    public int postId;
    public String title;
    public String description;
    public String author;
    public LocalDate date;
    public String status;
    public List<Review> reviews;
}
