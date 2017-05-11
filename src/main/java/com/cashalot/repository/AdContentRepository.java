package com.cashalot.repository;


import com.cashalot.domain.ad.AdContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdContentRepository extends JpaRepository<AdContent,Long> {
}
