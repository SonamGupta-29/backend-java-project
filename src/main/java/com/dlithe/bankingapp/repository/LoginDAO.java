package com.dlithe.bankingapp.repository;


import com.dlithe.bankingapp.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDAO extends JpaRepository<Login, Integer> {

    @Query(value = "SELECT * FROM login WHERE name= ?1 and id = ?2", nativeQuery = true)
    Login findByName(String userName, int userId);

}
