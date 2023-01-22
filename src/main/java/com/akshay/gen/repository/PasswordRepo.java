package com.akshay.gen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.gen.entity.PasswordEntity;

public interface PasswordRepo extends JpaRepository<PasswordEntity, Long>{

	List<PasswordEntity> findByUserId(String userId);
	
}
