package com.ecc.QueryManagement.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecc.QueryManagement.models.Query;


public interface QueriesRepository extends JpaRepository<Query, Long> {

}
