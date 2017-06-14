package com.cashalot.repository;

import com.cashalot.domain.subject.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
