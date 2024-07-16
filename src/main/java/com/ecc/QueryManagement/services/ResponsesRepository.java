package com.ecc.QueryManagement.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecc.QueryManagement.models.Response;

public interface ResponsesRepository  extends JpaRepository<Response, Long>{

}
