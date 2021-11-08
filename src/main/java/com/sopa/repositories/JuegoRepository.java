package com.sopa.repositories;


import com.sopa.models.Juego;
import org.springframework.data.repository.CrudRepository;


public interface JuegoRepository extends CrudRepository<Juego, Integer> {
}
