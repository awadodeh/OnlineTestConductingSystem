package com.mum.pm.user_module.repository;

import com.mum.pm.user_module.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
