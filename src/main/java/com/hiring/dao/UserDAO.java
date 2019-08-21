package com.hiring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiring.entity.User;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
	User findByUsername(String username);
}
