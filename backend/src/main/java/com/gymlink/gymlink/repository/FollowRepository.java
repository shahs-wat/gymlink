package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Follow;
import com.gymlink.gymlink.entity.FollowId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, FollowId> {
}