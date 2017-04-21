package com.mum.pm.user_module.repository;

import com.mum.pm.user_module.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long>{
}
