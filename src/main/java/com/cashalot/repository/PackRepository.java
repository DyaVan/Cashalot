package com.cashalot.repository;

import com.cashalot.domain.appflow.Pack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PackRepository extends JpaRepository<Pack,Long> {
}
