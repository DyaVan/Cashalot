package com.cashalot.repository;


import com.cashalot.domain.actors.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User,Long>{

    User findByEmail(String email);

}
