package com.asp.society.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.asp.society.models.ERole;
import com.asp.society.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);

}
