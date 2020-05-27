package com.lmiguel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lmiguel.workshopmongo.domain.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}