package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}