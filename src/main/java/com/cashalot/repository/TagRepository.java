package com.cashalot.repository;

import com.cashalot.domain.subject.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TagRepository extends JpaRepository<Tag,Long> {
}
