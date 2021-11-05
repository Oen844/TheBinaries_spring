package com.sopa.services;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopa.entities.Users;
import com.sopa.repositories.UsersRepository;

@Component

public class UsersService {
    @Autowired
    UsersRepository userRepo;

    protected EntityManager em;

    public UsersService(EntityManager em) {
        this.em = em;
    }

    public Users lastUser() {
        List<Users> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        int size = userList.size();
        Users user = userList.get(size - 1);
        return user;
    }
    public Users addUser(Users user) {
        user = userRepo.save(user);
        return user;
    }
}
