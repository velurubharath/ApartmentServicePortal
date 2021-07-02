package com.ASP.society.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ASP.society.models.ERole;
import com.ASP.society.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);

}
