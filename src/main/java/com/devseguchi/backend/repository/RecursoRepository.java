package com.devseguchi.backend.repository;

import com.devseguchi.backend.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoRepository extends JpaRepository<RecursoEntity,Long> {
}
