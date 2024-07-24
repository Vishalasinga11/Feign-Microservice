package com.ust.Userservice.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Fullresponse {
    public int userId;
    public String username;
    public String password;
    public String email;
    public LocalDate createddate;
    public LocalDate updateddate;
    public List<Post> posts;


}
