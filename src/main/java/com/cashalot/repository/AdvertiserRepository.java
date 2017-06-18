package com.cashalot.repository;


import com.cashalot.domain.actors.Advertiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AdvertiserRepository extends JpaRepository<Advertiser,Long>{

    @Override
    @Transactional
    Advertiser findOne(Long aLong);

    Advertiser findByEmailLogin(String emailLogin);
}
