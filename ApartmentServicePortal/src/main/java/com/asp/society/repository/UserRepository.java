package com.ASP.society.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ASP.society.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String Username);

    Boolean existsByUsername(String Username);

    Boolean existsByEmail(String email);
}
