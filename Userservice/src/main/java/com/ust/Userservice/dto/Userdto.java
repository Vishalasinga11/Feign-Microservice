package com.ust.Userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userdto {
    public int userId;
    public String username;
    public String password;
    public String email;
    public LocalDate createddate;
    public LocalDate updateddate;
}
