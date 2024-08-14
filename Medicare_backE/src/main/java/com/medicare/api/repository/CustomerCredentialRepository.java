package com.medicare.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.api.entity.CustomerCredential;

@Repository
public interface CustomerCredentialRepository extends JpaRepository<CustomerCredential, Integer>{

}
