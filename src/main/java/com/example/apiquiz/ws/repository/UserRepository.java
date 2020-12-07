package com.example.apiquiz.ws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.apiquiz.ws.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value = " SELECT * FROM public.user WHERE email = ?1 and password = ?2 ", nativeQuery = true)
	User login(String email,String password);
}
