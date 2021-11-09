package com.sopa.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopa.repositories.UsersRepository;
import com.sopa.models.Users;

@Component

public class UsersService {
    @Autowired
    UsersRepository usersRepo;

    protected EntityManager em;

    public UsersService(EntityManager em) {
        this.em = em;
    }

    public Users lastUsers() {
        List<Users> usersList = new ArrayList<>();
        usersRepo.findAll().forEach(usersList::add);
        int size = usersList.size();
        Users users = usersList.get(size - 1);
        return users;
    }
    public Users addUsers(Users users) {
        users = usersRepo.save(users);
        return users;
    }
}
