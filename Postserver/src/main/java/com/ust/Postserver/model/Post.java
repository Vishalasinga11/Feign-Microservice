package com.ust.Postserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "post")
public class Post {
    @Id
    public int postId;
    public String title;
    public String description;
    public String author;
    public LocalDate date;
    public String status;
    public int userId;
}
