package com.sopa.repositories;


import com.sopa.models.Palabra;
import org.springframework.data.repository.CrudRepository;

public interface PalabraRepository extends CrudRepository<Palabra, Integer> {
}
