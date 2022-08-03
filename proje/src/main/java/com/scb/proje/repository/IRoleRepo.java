package com.scb.proje.repository;

import com.scb.proje.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
