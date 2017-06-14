package com.cashalot.repository;


import com.cashalot.domain.subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SubjectRepository extends JpaRepository<Subject,Long> {

}
