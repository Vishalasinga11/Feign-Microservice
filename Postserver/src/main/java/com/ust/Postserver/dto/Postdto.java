package com.ust.Postserver.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Postdto {
    public int postId;
    public String title;
    public String description;
    public String author;
    public LocalDate date;
    @Pattern(regexp="^(draft|published|archived|deleted)$",message="Status should be archived,draft,deleted,published,deleted")
    public String status;
    public int userId;
}
