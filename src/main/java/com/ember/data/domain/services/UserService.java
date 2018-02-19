package com.ember.data.domain.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ember.data.domain.model.User;

@Component
public interface UserService {
	
	User findById(Long id);
	 
    User findByName(String name);
 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);

}
