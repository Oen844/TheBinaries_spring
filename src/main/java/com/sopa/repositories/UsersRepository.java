package com.sopa.repositories;

import com.sopa.models.Users;
import org.springframework.data.repository.CrudRepository;


public interface UsersRepository extends CrudRepository<Users, Integer> {
}
