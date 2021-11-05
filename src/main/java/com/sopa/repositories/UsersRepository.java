package com.sopa.repositories;

import com.sopa.entities.Users;
import org.springframework.data.repository.CrudRepository;

import com.sopa.entities.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}
