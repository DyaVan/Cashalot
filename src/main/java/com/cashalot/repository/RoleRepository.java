package com.cashalot.repository;

import com.cashalot.domain.actors.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role,Long>{


}
