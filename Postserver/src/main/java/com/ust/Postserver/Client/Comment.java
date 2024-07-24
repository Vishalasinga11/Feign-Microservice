package com.ust.Postserver.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    public int commentId;
    public String author;
    public String content;
    public LocalDate date;
    public int postId;
}
