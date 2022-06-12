package com.ousseynou.mbodji.backendmodelsis.repository;

import com.ousseynou.mbodji.backendmodelsis.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
