package com.cashalot.repository;

import com.cashalot.domain.subject.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<Tag,Long> {
}
