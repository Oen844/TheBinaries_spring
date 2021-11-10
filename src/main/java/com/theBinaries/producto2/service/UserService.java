package com.theBinaries.producto2.service;

import com.theBinaries.producto2.Repository.UserRepository;
import com.theBinaries.producto2.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepo;

    protected EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }

    public User lastUser() {
        List<User> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        int size = userList.size();
        User user = userList.get(size - 1);
        return user;
    }
    public User addUser(User user) {
        user = userRepo.save(user);
        return user;
    }
}
