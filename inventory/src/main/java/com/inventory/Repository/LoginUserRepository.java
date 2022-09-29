package com.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inventory.Entity.LoginUser;

public interface LoginUserRepository extends JpaRepository <LoginUser, Integer> {
    
    @Query(value = "select count (*) from login_user where username = :loginUsername and password = :loginPassword",
            nativeQuery = true)
    public int checkUser(String loginUsername, String loginPassword);
}
