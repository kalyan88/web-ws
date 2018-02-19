package com.ember.data.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ember.data.domain.dmo.UserDmo;

public interface UserRepository extends JpaRepository<UserDmo, Long> {
	
	UserDmo findByName(String name);

}
