package com.ust.Userservice.repository;

import com.ust.Userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Integer> {
}
