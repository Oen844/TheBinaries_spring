package com.sopa.repositories;

import com.sopa.entities.Juego;
import org.springframework.data.repository.CrudRepository;
import com.sopa.entities.Juego;

public interface JuegoRepository extends CrudRepository<Juego, Integer> {
}
