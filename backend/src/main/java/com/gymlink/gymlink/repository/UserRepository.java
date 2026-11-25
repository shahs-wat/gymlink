package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}