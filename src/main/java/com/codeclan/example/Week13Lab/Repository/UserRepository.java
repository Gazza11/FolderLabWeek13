package com.codeclan.example.Week13Lab.Repository;

import com.codeclan.example.Week13Lab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
