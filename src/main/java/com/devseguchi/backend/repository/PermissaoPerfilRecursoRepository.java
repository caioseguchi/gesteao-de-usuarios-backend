package com.devseguchi.backend.repository;

import com.devseguchi.backend.entity.PermissaoPerfilRecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoPerfilRecursoRepository extends JpaRepository<PermissaoPerfilRecursoEntity, Long> {

}
