package com.ember.data.domain.services;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ember.data.domain.dao.UserRepository;
import com.ember.data.domain.dmo.UserDmo;
import com.ember.data.domain.model.User;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		User user = new User();
		UserDmo userDmo = userRepository.findOne(id);
		try {
			BeanUtils.copyProperties(user, userDmo);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User findByName(String name) {
		User user = new User();
		UserDmo userDmo = userRepository.findByName(name);
		try {
			BeanUtils.copyProperties(user, userDmo);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void saveUser(User user) {
		UserDmo userDmo = new UserDmo();
		try {
			BeanUtils.copyProperties(userDmo,user);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		userRepository.saveAndFlush(userDmo);
	}

	@Override
	public void updateUser(User user) {
		UserDmo userDmo = new UserDmo();
		try {
			BeanUtils.copyProperties(userDmo,user);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		userRepository.saveAndFlush(userDmo);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllUsers() {
		List<UserDmo> orgList = this.userRepository.findAll();
		List<User> destList = new ArrayList<User>() ;
		int i=0;
		try {
			for(UserDmo orgBean : orgList) {
				User destBeanName = new User();
				BeanUtils.copyProperties(destBeanName, orgList.get(i));
				i++;
				destList.add(destBeanName);
				
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return destList;
	}

	@Override
	public boolean isUserExist(User user) {
		boolean userDmo;
		userDmo = userRepository.findByName(user.getName())!=null;
		return userDmo;
	}

}
