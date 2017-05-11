package com.cashalot.repository;


import com.cashalot.domain.actors.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
