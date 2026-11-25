package com.gymlink.gymlink.repository;

import com.gymlink.gymlink.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}