package com.cashalot.repository;

import com.cashalot.domain.appflow.PackSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PackSlotRepository extends JpaRepository<PackSlot,Long> {
}
