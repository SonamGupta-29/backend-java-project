package com.dlithe.bankingapp.repository;


import com.dlithe.bankingapp.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDAO extends JpaRepository<Login, Integer> {

}
