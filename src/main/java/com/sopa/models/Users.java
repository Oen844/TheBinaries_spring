package com.sopa.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {


    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int idUsername;
    private String username;

    public Users() {

    }

    public Users(String username) {
        super();
        this.username = username;
    }

    public int getIdUsername() {
        return idUsername;
    }
    public void setIdUsername(int idUsername) {
        this.idUsername = idUsername;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Users [idUsername=" + idUsername + ", username=" + username + "]";
    }


}