package com.Lloren.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Lloren.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "select * from user where username = ?1 and password = ?2", nativeQuery = true)
	public User signIn(String username,String password);
	
	@Query(value = "select * from user where email = ?1", nativeQuery = true)
	public User findByEmail(String email);
	
}
