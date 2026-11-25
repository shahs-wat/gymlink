package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Like;
import com.gymlink.gymlink.entity.LikeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, LikeId> {
}