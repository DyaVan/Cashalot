package com.cashalot.repository;


import com.cashalot.domain.appflow.TagBinding;
import com.cashalot.domain.subject.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagBindingRepository extends JpaRepository<TagBinding,Long>{
}
