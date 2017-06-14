package com.cashalot.repository;

import com.cashalot.domain.appflow.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ViewRepository extends JpaRepository<View,Long> {
}
