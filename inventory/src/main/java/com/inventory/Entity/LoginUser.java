package com.inventory.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "login_user")
public class LoginUser {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "username")
    public String username;

    @Column(name = "password")
    public String password;

    @Override
    public String toString() {
        return "LoginUser [id=" + id + ", password=" + password + ", username=" + username + "]";
    }
  
}
