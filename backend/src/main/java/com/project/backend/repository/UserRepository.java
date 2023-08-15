package com.project.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.backend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
