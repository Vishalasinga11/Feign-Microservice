package com.ust.Userservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    public int userId;
    public String username;
    public String password;
    public String email;
    public LocalDate createddate;
    public LocalDate updateddate;


}
