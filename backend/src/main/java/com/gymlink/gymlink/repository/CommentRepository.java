package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}