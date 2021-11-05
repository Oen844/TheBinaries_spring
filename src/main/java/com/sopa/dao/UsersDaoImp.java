package com.sopa.dao;
import com.sopa.models.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class UsersDaoImp implements UsersDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void registrar(Users usuario) {
        entityManager.merge(usuario);
    }
}
