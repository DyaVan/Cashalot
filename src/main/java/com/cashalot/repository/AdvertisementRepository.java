package com.cashalot.repository;


import com.cashalot.domain.ad.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdvertisementRepository extends JpaRepository<Advertisement,Long> {



}
