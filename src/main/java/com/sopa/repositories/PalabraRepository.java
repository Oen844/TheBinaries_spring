package com.sopa.repositories;

import com.sopa.entities.Palabra;
import org.springframework.data.repository.CrudRepository;

public interface PalabraRepository extends CrudRepository<Palabra, Integer> {
}
