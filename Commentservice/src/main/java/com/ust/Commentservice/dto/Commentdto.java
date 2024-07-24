package com.ust.Commentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commentdto {
    public int commentId;
    public String author;
    public String content;
    public LocalDate date;
    public int postId;
}
