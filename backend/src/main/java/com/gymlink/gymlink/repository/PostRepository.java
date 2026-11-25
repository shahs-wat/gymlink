package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}