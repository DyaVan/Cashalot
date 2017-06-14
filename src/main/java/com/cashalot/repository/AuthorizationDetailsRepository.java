package com.cashalot.repository;


import com.cashalot.domain.actors.AuthorizationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AuthorizationDetailsRepository extends JpaRepository<AuthorizationDetails,Long>{

    @Transactional
    AuthorizationDetails findByEmail(String email);

}
