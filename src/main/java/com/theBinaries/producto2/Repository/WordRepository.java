package com.theBinaries.producto2.Repository;

import com.theBinaries.producto2.entities.Word;
import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Integer> {

}