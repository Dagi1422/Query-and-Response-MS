package com.ecc.QueryManagement.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecc.QueryManagement.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
