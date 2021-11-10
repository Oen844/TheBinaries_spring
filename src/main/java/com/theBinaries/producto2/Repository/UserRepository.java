package com.theBinaries.producto2.Repository;

import com.theBinaries.producto2.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
