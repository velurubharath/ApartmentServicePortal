package com.asp.society.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.asp.society.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String Username);

    Boolean existsByUsername(String Username);

    Boolean existsByEmail(String email);
}
