package com.example.logindemo.userRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.logindemo.model.UserLoginDetails;

@Repository
public interface UserRepository extends JpaRepository<UserLoginDetails, Long> {
}


