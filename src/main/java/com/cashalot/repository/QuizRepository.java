package com.cashalot.repository;

import com.cashalot.domain.ad.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
